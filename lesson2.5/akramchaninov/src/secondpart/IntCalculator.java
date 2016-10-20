package secondpart;

class IntCalculator {

  public static void main(String[] args) {
    System.out.println("2+2+2 = " + calc("2+2+2"));
    System.out.println("2-2+2 = " + calc("2-2+2"));
    System.out.println("2*2*2 = " + calc("2*2*2"));
    System.out.println("2+2*2 = " + calc("2+2*2"));

    System.out.println("22+16*2 = " + calc("22+16*2"));
    System.out.println("120+3*2-90 = " + calc("120+3*2-90"));
    System.out.println("5+6*20+15+15 = " + calc("5+6*20+15+15"));
    System.out.println("313+4*5 = " + calc("313+4*5"));
  }

  public static int calc(String expression) {
    int result = 0, index = 0;
    int numbofargs = checkNumberOfArgs(expression);
    int[] args = new int[numbofargs];
    int[] ops = new int[numbofargs-1];
    String subexp = "";
    for (int i = 0; i < expression.length(); i++) {
      if (isDigit(expression.charAt(i))) {
        subexp += expression.charAt(i);
      }
      else {
        args[index] = (int) convertSubexpToInt(subexp);
        subexp = "";
        ops[index] = i;
        index++;
      }
      if (index == numbofargs-1) {
        args[index] = (int) convertSubexpToInt(subexp);
      }
    }

    for (int i = 0; i < numbofargs - 1; i++) {
      if (expression.charAt(ops[i]) == '\u002A') {
        args[i + 1] = args[i] * args[i + 1];
        args[i] = 0;
      }
      if (expression.charAt(ops[i]) == '\u002D') {
        args[i+1] *= (-1);
      }
    }

    for (int i = 0; i < numbofargs; i++) {
      result += args[i];
    }
    return result;
  }

  public static boolean isDigit(char ch) {
    boolean digit;
    int c = Character.getNumericValue(ch);
    if (c >= 0 && c <= 9)
      digit = true;
    else
      digit = false;
    return digit;
  }

  public static int convertSubexpToInt (String subexp) {
    int number = 0;
    for (int i = 0; i < subexp.length(); i++) {
      number += Character.getNumericValue(subexp.charAt(i)) * power(10, (subexp.length() - 1 - i));
    }
    return number;
  }

  public static int checkNumberOfArgs(String expression) {
    int arrlength = 1;
    for (int i = 0; i < expression.length(); i++) {
      if (!isDigit(expression.charAt(i))) {
        arrlength++;
      }
    }
    return arrlength;
  }

  public static int power(int a, int b) {
    int result = a;
    if (b == 0)
      result = 1;
    if (b == 1)
      result = a;
    else {
      for (int i = 2; i <= b; i++)
      result *= a;
    }
    return result;
  }

}
