package tasks;
class Converters {
  public static void main(String[] args) {
    System.out.println(convertBinToDec2("11101001"));
    System.out.println(convertDecToBin1(233));
    System.out.println(convertDecToBin2(233));
  }


  public static int convertBinToDec2(String binary) {
    int length = binary.length();
    int total = 0, value;

    for (int i = 0; i < length; i++) {
      value = Character.getNumericValue(binary.charAt(i));
      if (value > 1|| value < 0) return 0;

      total = total*2 + value;
    }
    return total;
  }


  public static String convertDecToBin1(int decimal) {
    String result = "";

    while (decimal > 0) {
      result = decimal % 2 + result;
      decimal /= 2;
    }

    return result;
  }


  public static String convertDecToBin2(int decimal) {
    String result = "";
    int maxPow = 0, digit;

    while (power(2, maxPow) < decimal) {
      maxPow++;
    }
    maxPow -= 1;

    while (maxPow >= 0) {
      if ( decimal >= power(2, maxPow) ) {
        digit = 1;
        decimal -= power(2, maxPow);
      } else {
        digit = 0;
      }
      maxPow--;
      result = result + digit;
    }

    return result;
  }

  public static int power(int a, int b) {
    int result = 1;
    for (int i = 0; i < b; i++) {
      result *= a;
    }
    return result;
  }


}
