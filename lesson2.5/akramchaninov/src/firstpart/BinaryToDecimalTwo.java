package firstpart;

class BinaryToDecimalTwo {

  public static void main (String[] args) {
    String binary1 = "0101";
    String binary2 = "10110010";
    String binary3 = "011001010110";
    System.out.println(binary1 + " equals " + convertBinToDec2(binary1));
    System.out.println(binary2 + " equals " + convertBinToDec2(binary2));
    System.out.println(binary3 + " equals " + convertBinToDec2(binary3));

  }

  public static int convertBinToDec2(String binary) {
    int total = 0;
    for (int i = 0; i < binary.length(); i++) {
      total = total * 2 + Character.getNumericValue(binary.charAt(i));
    }
    return total;
  }

}
