
class BitwiseCalc {	
	public static void main(String[] args) {
		BitwiseCalc bitwise = new BitwiseCalc();
		
		System.out.println("BITWISE AND :");
		System.out.println("0 & 0 = " + bitwise.and("0", "0"));
		System.out.println("0 & 1 = " + bitwise.and("0", "1"));
		System.out.println("1 & 0 = " + bitwise.and("1", "0"));
		System.out.println("1 & 1 = " + bitwise.and("1", "1"));
		System.out.println("1101 & 1001 = " + bitwise.and("1101", "1001"));
		System.out.println("10101 & 01101 = " + bitwise.and("10101", "01101"));
		System.out.println("11010110 & 10110101 = " + bitwise.and("11010110", "10110101"));
		
		System.out.println("");
		System.out.println("BITWISE OR :");
		System.out.println("0 | 0 = " + bitwise.or("0", "0"));
		System.out.println("0 | 1 = " + bitwise.or("0", "1"));
		System.out.println("1 | 0 = " + bitwise.or("1", "0"));
		System.out.println("1 | 1 = " + bitwise.or("1", "1"));
		System.out.println("1101 | 1001 = " + bitwise.or("1101", "1001"));
		System.out.println("10101 | 01101 = " + bitwise.or("10101", "01101"));
		System.out.println("11010110 | 10110101 = " + bitwise.or("11010110", "10110101"));
		
		System.out.println("");
		System.out.println("BITWISE XOR :");
		System.out.println("0 ^ 0 = " + bitwise.xor("0", "0"));
		System.out.println("0 ^ 1 = " + bitwise.xor("0", "1"));
		System.out.println("1 ^ 0 = " + bitwise.xor("1", "0"));
		System.out.println("1 ^ 1 = " + bitwise.xor("1", "1"));
		System.out.println("1101 ^ 1001 = " + bitwise.xor("1101", "1001"));
		System.out.println("10101 ^ 01101 = " + bitwise.xor("10101", "01101"));
		System.out.println("11010110 ^ 10110101 = " + bitwise.xor("11010110", "10110101"));
		
		System.out.println("");
		System.out.println("BITWISE NOT :");
		System.out.println("~ 0 = " + bitwise.not("0"));
		System.out.println("~ 1 = " + bitwise.not("1"));
		System.out.println("~ 1101 = " + bitwise.not("1101"));
		System.out.println("~ 10101 = " + bitwise.not("10101"));
		System.out.println("~ 11010110 = " + bitwise.not("11010110"));

	}
	
	public String and(String binaryLeft, String binaryRight) {
		int result = Integer.parseInt(binaryLeft, 2) & Integer.parseInt(binaryRight, 2);
		return Integer.toBinaryString(result);
	}
	
	public String or(String binaryLeft, String binaryRight) {
		int result = Integer.parseInt(binaryLeft, 2) | Integer.parseInt(binaryRight, 2);
		return Integer.toBinaryString(result);
	}
	
	public String xor(String binaryLeft, String binaryRight) {
		int result = Integer.parseInt(binaryLeft, 2) ^ Integer.parseInt(binaryRight, 2);
		return Integer.toBinaryString(result);
	}
	
	public String not(String binary) {
		String result = "";
		for (int i=0; i < binary.length(); i++) {
			result += (binary.charAt(i) == '1') ? '0' : '1';
		}
		return result;
	}
}