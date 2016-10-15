package pack.lessons;

 public class Lesson2Variables {
	 
    public static void printStars() {
		System.out.println("*****");
	}
	 
	public static void main(String[] args){
		System.out.println("Andrey Fedosenko. Homework. Lesson2.");
		
		int i = 13;
		float fl = 0.13f;
		String str = "It`s my String";
		
		// Task #1
		System.out.println("--- Task #1. Variables.");
		System.out.println("Int i = "+ i);
		System.out.println("Float fl = " + fl);
		System.out.println("String str = " + str); 
		
		// Task #2-0
		//System.out.println("--- Task #2-0");  // Commented due task 2-1
		//printStars();
		//printStars();
		//printStars();
		//printStars();
		//printStars();
	
		// Task #2-1
		System.out.println("--- Task #2. Loops.");
		for (i = 1; i <= 5; i++) {
			printStars();
		}
		
		// Task #3
		System.out.println("--- Task #3. Logical operators.");
		int year = 2001;
		int lastyear = 2016;
		while (year <= lastyear) {
			if (isLeapYear(year)) 
				System.out.println(year + " - is Leap year!");
			else 
				System.out.println(year + " - is not Leap year!");
			year++;
		}
		
		// Task #4
		System.out.println("--- Task #4. Infinite loops.");
		i = 1;
		do {
			System.out.println("It seems that I'm here forever #" + i);
			if (i == 5) break;
			i++;
		} while (true);
		
		// Task #5 (Optional)
		System.out.println("--- Task #5. String to Int (Optional).");
		String bin = "11101110000";
		int ans = convert(bin);
		if (ans >= 0 ) 
			System.out.println("Binary " + bin + " equals Decimal " + ans);
		else 		   
			System.out.println("It is not binary, Dude! - " + " your binary = " + bin);
	
	} // end of main()
	
	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { // Leap Year
			return true;
		} else return false;                                               // non-Leap Year 
	}	

	public static int convert(String binary) {
		char tmp = ' ';
		int len = binary.length();
		int sum = 0;
		
		for (int j = 0; j <= len-1; j++) {
			tmp = binary.charAt(len-1-j);
			if ((tmp != '1') && (tmp != '0')) {       // Foolproof. Защита.
				return -1;
			} else {
				if ('1' == tmp) {
					sum = sum + lightPow(2, j);
				} // end of if ()
			} // end of else 
		} // end of for()
		return sum;	
	} // end of convert()
	
	public static int lightPow(int base, int power) {
		int result = 1;
		for (int k = 0; k < power; k++) {  // Заменяем циклом Math.pow().
			result = result * base;
		}
		return result;
	} // end of lightPow()
	
} // end of class Lesson2Variables

