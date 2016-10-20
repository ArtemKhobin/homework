
public class Calculator {
	public static void main(String[] args) {
        
		System.out.println(calc("-2+2-2+2-7-3"));

    }

    public static double calc (String expression){
        double result = 0;
        char[] charBuffer = expression.toCharArray();
        for (int i = 0; i < expression.length(); i += 2){
        	if (i == charBuffer.length - 1){
        		if (charBuffer[i-1] == '-') result -= Character.getNumericValue(charBuffer[i]);
        		else if (charBuffer[i-1] == '+') result += Character.getNumericValue(charBuffer[i]);
        	}
        	else if (i == 0 && charBuffer[i+1] != '*' && charBuffer[i+1] != '/'){
        		if (charBuffer[i] == '-'){
            		result -= Character.getNumericValue(charBuffer[1]);
            		i+=1;
            	}
        		else{
        		result += Character.getNumericValue(charBuffer[i]);
        		}
        	}
        	else if(charBuffer[i-1] == '+' && charBuffer[i+1] != '*' && charBuffer[i+1] != '/'){
        		result += Character.getNumericValue(charBuffer[i]);
        	}
        	else if(charBuffer[i-1] == '-' && charBuffer[i+1] != '*' && charBuffer[i+1] != '/'){
        		result -= Character.getNumericValue(charBuffer[i]);
        	}
        }
        
        return result;
    }
}