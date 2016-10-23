public class Calc_a {
    public static void main(String[] args) {
        String expression = "-1+2-2*5/2";
        if (expressionIsOk(expression))
        System.out.println(calc(expression));
        else System.out.println("Check your numbers!");


    }

    public static int calc(String expression){
        int result = 0;
        char[] charBuffer = expression.toCharArray();
        for (int i = 0; i < expression.length(); i += 2){
        	if (charBuffer[i] == '-'){
        		i++;
        	}
        	if (i == charBuffer.length - 1){
        		if(charBuffer[i-1] == '-'){
					result += -Character.getNumericValue(charBuffer[i]);
				}
			else{
					result += Character.getNumericValue(charBuffer[i]);
				}
        	}
        	else if(i < charBuffer.length - 1 && charBuffer[i+1] != '*' && charBuffer[i+1] != '/'){
        		int j = i;
        		while(j < charBuffer.length - 1 && (charBuffer[j+1] != '*' && charBuffer[j+1] != '/')){
        			if(j > 0 && charBuffer[j-1] == '-'){
        					result += -Character.getNumericValue(charBuffer[j]);
        				}
        			else{
        					result += Character.getNumericValue(charBuffer[j]);
        				}
        			j += 2;
        		}
        		i = j - 2;
        	}
        	else if (charBuffer[i+1] == '*' || charBuffer[i+1] == '/'){
        		double tmp = Character.getNumericValue(charBuffer[i]);
        		while (i <= charBuffer.length - 3 && (charBuffer[i+1] == '*' || charBuffer[i+1] == '/')){
        			if(charBuffer[i+1] == '*'){
        				if(i > 0 && charBuffer[i-1] == '-'){
        					tmp *= -Character.getNumericValue(charBuffer[i+2]);
        				}
        				else{
        					tmp *= Character.getNumericValue(charBuffer[i+2]);
        				}
        			}
        			else{
        				if(i > 0 && charBuffer[i-1] == '-'){
        					tmp /= -Character.getNumericValue(charBuffer[i+2]);
        				}
        				else{
        					tmp /= Character.getNumericValue(charBuffer[i+2]);
        				}
        			}
        			i += 2;
        		}
        		result += tmp;
        		tmp = 0;
        	}


        }

        return result;


    }

      public static boolean expressionIsOk(String string){
        for (int i = 0; i < string.length(); i+=2){
        	if (string.charAt(i) == '-') i++;
        	if ((string.charAt(i) < '0' || string.charAt(i) > '9') && (string.charAt(i+1) != '*' || string.charAt(i+1) != '/'
        			|| string.charAt(i+1) != '+' || string.charAt(i-1) != '-')){
        		return false;
        	}
        }
        if(string.charAt(string.length()-1) < '0' || string.charAt(string.length()-1) > '9') return false;
        return true;
    }
}
