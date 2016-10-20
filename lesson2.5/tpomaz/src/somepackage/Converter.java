package somepackage;

class Converter {	
	public static void main(String[] args) {

		System.out.println("Task #1");
		String binNumber1 = "010101011";
		System.out.println("The number in the binary system: " + binNumber1);
		
		int decNumber1 = convertBinToDec1(binNumber1); 
		System.out.println("The number in the decimal system: " + decNumber1);
		
		
		System.out.println("");
		System.out.println("Task #2");
		String binNumber2 = "010101011";
		System.out.println("The number in the binary system: " + binNumber2);
		
		int decNumber2 = convertBinToDec2(binNumber2); 
		System.out.println("The number in the decimal system: " + decNumber2);
		
		
		// Task 03
		System.out.println("");
		System.out.println("Task #3");
		int decNumber3 = 171;
		System.out.println("The number in the decimal system: " + decNumber3);
		
		String binNumber3 = convertDecToBin1(decNumber3);
		System.out.println("The number in the binary system: " + binNumber3);
		
				
		// Task 04
		System.out.println("");
		System.out.println("Task #4");
		int decNumber4 = 171;
		System.out.println("The number in the decimal system: " + decNumber4);
		
		String binNumber4 = convertDecToBin2(decNumber4);
		System.out.println("The number in the binary system: " + binNumber4);
	}
	
	public static int convertBinToDec1(String binary) {
		char symbol = '0';
		int result = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			symbol = binary.charAt(binary.length() - 1 - i);
			
			if (symbol != '1' && symbol != '0') {
				System.out.println("Error in the " + i + "th symbol. In the binary system is used only \'0\' and \'1\'.");
				return -1;
			}
			if (symbol == '1') result += power(2, i);
		}  
		
		return result;
    }
	
	public static int convertBinToDec2(String binary) {
		char symbol = '0';
		int result = 0, binNumber = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			symbol = binary.charAt(i);
			
			if (symbol != '1' && symbol != '0') {
				System.out.println("Error in the " + i + "th symbol. In the binary system is used only \'0\' and \'1\'.");
				return -1;
			}
			
			binNumber = Character.getNumericValue(symbol);
			result = result * 2 + binNumber; 
		}  
		return result;
	}
	
	public static String convertDecToBin1(int decimal) {
		String binary = "";
		
		while (decimal > 0) {
			binary = decimal % 2 + binary;
			decimal = decimal / 2;
		}
		return binary;
	}
	
	public static String convertDecToBin2(int decimal) {
		String binary = "";
		
		int i = getMaxPower(decimal);
		int number = power(2, i);
		
		 while (i >= 0) {
            if (decimal - number >= 0) {
                binary += "1";
                decimal = decimal - number;
                number = power(2, --i);
            } else {
                binary += "0";
                number = power(2, --i);
            }
        }
		
		return binary;
	}
	
	public static int power(int a, int b) {
		int result = 1;	
		for (int i = 0; i < b; i++) {
			result = result * a;
		}
		return result;
	}
	
	public static int getMaxPower(int decimal) {
		int i = 0;
		
		while (true) { 
			if (decimal < power(2, i + 1)) break; 
			i++;
		};
		return i;
	}	
}	