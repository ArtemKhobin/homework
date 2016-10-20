package pack.lessons;

 public class Lesson25BinDecConvers {

	public static int power(int base, int pow) {
		int result = 1;
		for (int k = 0; k < pow; k++) {  // Math.pow() заменяем циклом.
			result = result * base;
		}
		return result;
	} // end of power()

	public static void main(String[] args){
		System.out.println("Andrey Fedosenko. Homework. Lesson2.5");
		String binary = "0011101110000";

		// Task #1
		System.out.println("\n--- Task #1. Binary to Decimal. Positional Notation.");
		int ans = convertBinToDec1(binary);
		if (ans >= 0 )
			System.out.println("Binary " + binary + " equals Decimal " + ans);
		else
			System.out.println("It is not binary, Dude! - " + " your binary = " + binary);

		// Task #2
		System.out.println("\n--- Task #2. Binary to Decimal. Doubling.");
		ans = convertBinToDec2(binary);
		if (ans >= 0 )
			System.out.println("Binary " + binary + " equals Decimal " + ans);
		else
			System.out.println("It is not binary, Dude! - " + " your binary = " + binary);

	} // end of main()

	public static int convertBinToDec1(String binary) {
		char tmp = ' ';
		int len = binary.length();
		int sum = 0;

		for (int j = 0; j <= len-1; j++) {
			tmp = binary.charAt(len-1-j);
			if ((tmp != '1') && (tmp != '0')) {       // Foolproof
				return -1;
			} else {
				if ('1' == tmp) {
					sum = sum + power(2, j);
				} // end of if ()
			} // end of else
		} // end of for()
		return sum;
	} // end of convertBinToDec1()

	public static int convertBinToDec2(String binary) {
		char tmp = ' ';
		int  len = binary.length();
		int  buf = 0;

		for (int j = 0; j <= len-1; j++) {
			tmp = binary.charAt(j);
			if ((tmp != '1') && (tmp != '0')) {       // Foolproof
				return -1;
			} else {
				buf = buf * 2;
				if ('1' == tmp)
					buf = buf + 1;
			} // end of else
		} // end of for()
		return buf;
	} // end of convertBinToDec2()

} // end of class Lesson25BinDecConvers
