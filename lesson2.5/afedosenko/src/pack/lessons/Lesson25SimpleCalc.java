package pack.lessons;

 public class Lesson25SimpleCalc {

	public static int power(int base, int pow) {
		int result = 1;
		for (int k = 0; k < pow; k++) {  // Math.pow() заменяем циклом.
			result = result * base;
		}
		return result;
	} // end of power()

  public static boolean isDigit(char ch) {
    int digit = Character.getNumericValue(ch);
    if (0 <= digit && digit <= 9)
      return true;
    else
      return false;
  }

  public static int stringToInt(String str) {
		int result = 0;
    for (int i = 0; i < str.length(); i++) {
        result = result * 10;
        result = result + Character.getNumericValue(str.charAt(i));
    }
    return result;
	} // end of stringToInt()

	public static void main(String[] args){
		System.out.println("Andrey Fedosenko. Homework. Lesson2.5");
		// Task #6
		System.out.println("\n--- Task #5. Simple Calculator.");

    String exp1 = "2+13"; // 15
    String exp2 = "2+22+545"; // 569
    String exp3 = "2+2-2+23"; // 25
    String exp4 = "5-2+10-4+11"; // 20
    String exp5 = "45+23-2+4-9+2"; // 63
    String exp6 = "+45+23-2+4-9+2"; // 63
    String exp7 = "-45+23-2+4-9+2"; // -27

    System.out.println(exp1 + " = " + calc(exp1));
    System.out.println(exp2 + " = " + calc(exp2));
    System.out.println(exp3 + " = " + calc(exp3));
    System.out.println(exp4 + " = " + calc(exp4));
    System.out.println(exp5 + " = " + calc(exp5));
    System.out.println(exp6 + " = " + calc(exp6));
    System.out.println(exp7 + " = " + calc(exp7));

	} // end of main()

  public static int calc(String expression) {

    int len = expression.length();
    String tmp = "";
    int sum = 0;
    boolean isdigit = false;
    char ch = ' ';
    int a = 0;
    int i = 0;
    String operation = "";

    while (true) {
       ch = expression.charAt(i);
       isdigit = isDigit(ch);
       if (ch == '+') {
         operation = "add";
         i++;
       }
       else if (ch == '-') {
         operation = "subtract";
         i++;
       }

       if (isdigit) {
        a = getNextInt(i, expression);
        if (i == 0 ) sum = sum + a;
        if (operation == "add") sum = sum + a;
        if (operation == "subtract") sum = sum - a;
        i = i + getSize(a);
      }
        if (i >= len) break;
    } // end of while
    return sum;
  } // end of calc()

  public static int getNextInt(int begin, String str) {
    int len = str.length();
    boolean isdigit = false;
    char ch = ' ';
    String tmp = "";
    for (int i = begin; i < len; i++) {
      ch = str.charAt(i);
      isdigit = isDigit(ch);
      if (isdigit)
        tmp = tmp + ch;
      else
        return stringToInt(tmp);
    }
    return stringToInt(tmp);
 } // end of getNextInt()

 public static int getSize(int number) {
        int count = 0;
        while (number > 0) {
            count += 1;
            number = (number / 10);
        }
        return count;
  } // end of stringToInt

} // end of class Lesson25SimpleCalc
