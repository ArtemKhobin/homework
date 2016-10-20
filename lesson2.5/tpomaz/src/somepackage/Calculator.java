package somepackage;

class Calculator {	
	public static void main(String[] args) {
			
		String str1 = "2+2+2";
		String str2 = "2-2+2";
		
		System.out.println(str1 + " = " + calc(str1));
		System.out.println(str2 + " = " + calc(str2));
			
	}
	
	public static int calc(String expression) {
		char symbol = ' ', operator = ' ';
		int result = 0;
		
		for (int i = 0; i < expression.length(); i++) {
			symbol = expression.charAt(i);
			
			if (isDigit(symbol)) {
				if (i == 0) {
					result = Character.getNumericValue(symbol);
				} else {
					if (operator == '-') {
						result -= Character.getNumericValue(symbol);
					} else {
						result += Character.getNumericValue(symbol);
					}
				}
			} else if (isOperator(symbol)) {
				operator = symbol;
			}
		}  

		return result;
    }
	
	public static boolean isDigit(char ch) {
		return (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9');
	}
	
	public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-';
    }
	
}