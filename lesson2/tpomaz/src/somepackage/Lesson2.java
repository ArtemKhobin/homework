package somepackage;

import java.util.Scanner;

class Lesson2 {
	
	public static void main(String[]args) {

		// Task 01
		int varInt = 10;
		String varStr = "It's String";
		float varFloat = 24.5f;
				
		System.out.println("Variable int = " + varInt);
		System.out.println("Variable String = " + varStr);
		System.out.println("Variable float = " + varFloat);
		
		
		// Task 02
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			printSomeStr();
		}
		
		
		// Task 03
		System.out.println("");
		int year = 2001;
		while (year <= 2016) {
			if (isLeapYear(year)) {
				System.out.println(year + " - is a leap-year!");
			} else {
				System.out.println(year + " - isn't a leap-year!");
			}
			year++;
		};
		
		
		// Task 04
		System.out.println("");
		int i = 0;
		do {
			System.out.println("It seems that I'm here forever");
			if (i == 10) break;
			i++;
		} while (true);
		
		
		// Task 06
		System.out.println("");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number in the binary system: ");
		int number = convert(in.nextLine()); 
		if (number >= 0) {
			System.out.println("The number in the decimal system: " + number);
		}
	}
	
	public static void printSomeStr() {
		System.out.println("*****");
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	public static int convert(String binary) {
		char symbol = '0';
		int result = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			symbol = binary.charAt(binary.length() - 1 - i);
			
			if (symbol != '1' & symbol != '0') {
				System.out.println("Error in the " + i + "th symbol. In the binary system is used only \'0\' and \'1\'.");
				return -1;
			}

			if (symbol == '1') result += (int)Math.pow(2, i);

		}
	  
		return result;
    }
}