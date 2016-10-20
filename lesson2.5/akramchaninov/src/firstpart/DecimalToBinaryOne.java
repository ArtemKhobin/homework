package firstpart;

class DecimalToBinaryOne {

  public static void main (String[] args) {
    int dec1 = 5; // 0101
    int dec2 = 178; // 10110010
    int dec3 = 1622; // 011001010110

    System.out.println(dec1 + " equals " + convertDecToBin1(dec1));
    System.out.println(dec2 + " equals " + convertDecToBin1(dec2));
    System.out.println(dec3 + " equals " + convertDecToBin1(dec3));
    System.out.println("Why 1 % 2 equals " + (1 % 2) + "?");
  }

  public static String convertDecToBin1(int decimal) {
    String binary = "";
    do {
      binary = (decimal % 2) + binary;
      decimal = decimal / 2;
    } while (decimal >= 1);
    return binary;
  }

}
