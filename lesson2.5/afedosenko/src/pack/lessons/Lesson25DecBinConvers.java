package pack.lessons;

 public class Lesson25DecBinConvers {

   public static int power(int base, int pow) {
     int result = 1;
     for (int k = 0; k < pow; k++) {
       result = result * base;
     }
     return result;
   } // end of power()

   public static void main(String[] args){
		System.out.println("Andrey Fedosenko. Homework. Lesson2.5");
		int decimal = 2208;

		// Task #3
		System.out.println("\n--- Task #3. Decimal to Binary. Short Division by Two with Remainder.");
		String ans = convertDecToBin1(decimal);
		System.out.println("Decimal " + decimal + " equals Binary " + ans);

		// Task #4
    System.out.println("\n--- Task #4. Decimal to Binary. Descending Powers of Two and Subtraction.");
    ans = convertDecToBin2(decimal);
    System.out.println("Decimal " + decimal + " equals Binary " + ans);

	} // end of main()

	public static String convertDecToBin1(int decimal) {
		int tmp = 0;
		String sum = "";
    String binary = "";
    while (true) {
        tmp = decimal % 2;
        decimal = decimal / 2;
        if (tmp == 0)
            sum = sum + "0";
        else if (tmp == 1)
              sum = sum + "1";
        if (decimal == 0) break;
    } // end of while

    int len = sum.length();
    for (int j = 0; j <= len - 1; j++) {
        binary = binary + sum.charAt(len - j - 1);
    }
		return binary;
	} // end of convertDecToBin1()

	public static String convertDecToBin2(int decimal) {
    int  pow = getMaxPower(decimal);
    int  buf = power(2, pow);
    String binary = "";

    if (decimal != 0)
        binary = binary + "1";
    else
        binary = binary + "0";

    for (int j = pow - 1; j >= 0; j--) {
          buf = decimal - power(2, getMaxPower(decimal));
          if (power(2, j) > buf) {
              binary = binary + "0";
          }
          else {
              binary = binary + "1";
              decimal = buf;
          }
    } // end of for()
	  return binary;
	} // end of convertBinToDec2()

  public static int getMaxPower(int input) {
    int  tmp = 0;
    int  pow = 0;
    while (true) {
      if (power(2, pow + 1) > input) {
          break;
      }
      else  pow++;
    }
    return pow;
  }

} // end of class Lesson25BinDecConvers
