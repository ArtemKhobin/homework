package firstpart;

class BinaryToDecimalOne {

  public static void main (String[] args) {
    String binary1 = "0101";
    String binary2 = "10110010";
    String binary3 = "011001010110";
    System.out.println(binary1 + " equals " + convertBinToDec1(binary1));
    System.out.println(binary2 + " equals " + convertBinToDec1(binary2));
    System.out.println(binary3 + " equals " + convertBinToDec1(binary3));
  }

  public static int convertBinToDec1(String binary) {
    int decimal = 0;
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1')
        decimal += power(2, ((binary.length() - 1) - i));
    }
    return decimal;
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

}
