package tasks;
class Calculator {


  public static void main(String[] args) {
    System.out.println(calc("22/2+2*(4-2)"));
    System.out.println(calc("2+2*(7-3)/2"));
  }

  public static int calc(String expression) {
    int parenthesesOpen, parenthesesClose, parenthesesResult;
    int operationPosition;
    char operation;

    while ( expression.length() > 0 ) {
      if (expression.lastIndexOf('(') > -1) {
        parenthesesOpen = expression.lastIndexOf('(');
        parenthesesClose = expression.lastIndexOf(')');

        parenthesesResult = calc(expression.substring(parenthesesOpen+1, parenthesesClose));

        expression = expression.substring(0, parenthesesOpen) + parenthesesResult + expression.substring(parenthesesClose + 1);
      } else if (expression.indexOf('*') > -1) {
        operationPosition = expression.indexOf('*');
        expression = calculateSubexpression(expression, operationPosition);
      } else if (expression.indexOf('/') > -1) {
        operationPosition = expression.indexOf('/');
        expression = calculateSubexpression(expression, operationPosition);
      } else if (expression.indexOf('+') > -1) {
        operationPosition = expression.indexOf('+');
        expression = calculateSubexpression(expression, operationPosition);
      } else if (expression.indexOf('-') > -1) {
        operationPosition = expression.indexOf('-');
        expression = calculateSubexpression(expression, operationPosition);
      } else {
        return Integer.parseInt(expression);
      }
    }
    return 0;
  }

  private static String calculateSubexpression(String expression, int position) {
    int a, b;
    int leftOperandLength, rightOperandLength;
    int result = 0;

    leftOperandLength = getOperandCharsCount(expression, position - 1, -1);
    rightOperandLength = getOperandCharsCount(expression, position + 1, 1);

    a = Integer.parseInt(expression.substring(position - leftOperandLength, position));
    b = Integer.parseInt(expression.substring(position + 1, position + 1 + rightOperandLength));

    switch (expression.charAt(position)) {
      case '*':
        result = a * b;
        break;
      case '/':
        result = a / b;
        break;
      case '+':
        result = a + b;
        break;
      case '-':
        result = a - b;
        break;
    }

    return expression.substring(0, position - leftOperandLength) + result + expression.substring(position + 1 + rightOperandLength);
  }


  private static int getOperandCharsCount(String expression, int position, int direction) {
    int result = 0;
    while (position >= 0 && position < expression.length() && Character.getNumericValue(expression.charAt(position)) > -1) {
      result++;
      position = (direction > 0) ? position + 1 : position - 1;
    }
    return result;
  }


}
