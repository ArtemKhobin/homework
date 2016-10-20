package firstpart;

class DecimalToBinaryTwo {

  public static void main (String[] args) {
    int dec1 = 5; // 0101
    int dec2 = 178; // 10110010
    int dec3 = 1622; // 011001010110

    System.out.println(dec1 + " equals " + convertDecToBin2(dec1));
    System.out.println(dec2 + " equals " + convertDecToBin2(dec2));
    System.out.println(dec3 + " equals " + convertDecToBin2(dec3));
  }

  public static String convertDecToBin2(int decimal) {
    String binary = "";
    int maxpower;
    if (decimal != 0) {
      while (decimal > 0) {
        binary += 1;
        maxpower = countMaxPowerOfTwo(decimal);
        decimal -= power(2, maxpower);
        for (int i = 1; i <= maxpower; i++) {
          if (decimal < power(2, (maxpower - i)) && decimal > 0)
            binary += 0;
          else break;
        }
      }
    } else binary = "0000";
    return binary;
  }

  public static int power(int a, int b) {
    int result = a;
    if (b == 0)
      result = 1;
    if (b == 1)
      result = a;
    else {
      for (int i = 2; i <= b; i++)
      result *= a;
    }
    return result;
  }

  public static int countMaxPowerOfTwo(int dec) {
    int power = 0;
    do {
      dec /= 2;
      power++;
    } while (dec > 1);
    return power;
  }

}
