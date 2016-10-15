package thirdpart;

import java.lang.Math;

class BinaryToDecimal {

  public static void main (String[] args) {
    String binary1 = "0101";
    String binary2 = "10110010";
    String binary3 = "011001010110";
    System.out.println(binary1 + " equals " + convert(binary1));
    System.out.println(binary2 + " equals " + convert(binary2));
    System.out.println(binary3 + " equals " + convert(binary3));
  }

  public static int convert(String binary) {
    int decimal = 0;
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1')
        decimal += (int) Math.pow(2, ((binary.length() - 1) - i));
    }
    return decimal;
  }
}
