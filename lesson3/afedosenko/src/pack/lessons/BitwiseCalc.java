package pack.lessons;

public class BitwiseCalc {

  public static String and(String binaryLeft, String binaryRight) {
      int a = Integer.parseInt(binaryLeft, 2);
      int b = Integer.parseInt(binaryRight, 2);
      int c = a & b;
      return Integer.toBinaryString(c);
  }

  public String or(String binaryLeft, String binaryRight) {
    int a = Integer.parseInt(binaryLeft, 2);
    int b = Integer.parseInt(binaryRight, 2);
    int c = a | b;
    return Integer.toBinaryString(c);
  }

  public String xor(String binaryLeft, String binaryRight) {
    int a = Integer.parseInt(binaryLeft, 2);
    int b = Integer.parseInt(binaryRight, 2);
    int c = a ^ b;
    return Integer.toBinaryString(c);
  }

  public String not(String binary) {
    int a = Integer.parseInt(binary, 2);
    String result = "";
    // a = ~a;                                    // Two's complement
    for (int i = 0; i < binary.length(); i++) {   // One's complement
      if (binary.charAt(i) == '0')
          result += '1';
      else
          result += '0';
    }
    // return Integer.toBinaryString(a);
    return result;
  }

	public static void main(String[] args) {
    BitwiseCalc calc = new BitwiseCalc();
    System.out.println("Bitwise AND: 1 & 0 = " + calc.and("1", "0"));
    System.out.println("Bitwise AND: 1101 & 1000 = " + calc.and("1101", "1000"));
    System.out.println("Another way for static AND: 1110010101 & 110011 = " + BitwiseCalc.and("1110010101", "110011"));

    System.out.println("Bitwise OR: 1 | 0 = " + calc.or("1", "0"));
    System.out.println("Bitwise OR: 1101 | 1000 = " + calc.or("1101", "1000"));
    System.out.println("Bitwise OR: 1110010101 | 110011 = " + calc.or("1110010101", "110011"));

    System.out.println("Bitwise XOR: 1 | 0 = " + calc.xor("1", "0"));
    System.out.println("Bitwise XOR: 1101 | 1000 = " + calc.xor("1101", "1000"));
    System.out.println("Bitwise XOR: 1110010101 | 110011 = " + calc.xor("1110010101", "110011"));

    System.out.println("Bitwise NOT: ~0 = " + calc.not("0"));
    System.out.println("Bitwise NOT: ~1011 = " + calc.not("1011"));
  }

}
