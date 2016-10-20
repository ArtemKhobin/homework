package lesson2.firstprogram;

class Hometask8{

    public static void main(String[] args) {
	    String str = "2+2+2"; // 6
		//String str = "2-2+2"; // 2
		//String str = "2*2*2"; // 8
		//String str = "2+2*2"; // 6
	    int i = calc(str);
        System.out.println("The result is " + i);		 
    }
	
    public static int calc(String expression){
	    int i = expression.length();
		char result1 = expression.charAt(0);
		if(isDigit(result1) == false) {return 0;};
	    int k = Character.getNumericValue(result1);
	    for(int j = 1; j <= i-1; j=j+2)
	    {
	      char result2 = expression.charAt(j);
		  char result3 = expression.charAt(j+1);
		  if(isDigit(result2) != true && isDigit(result3) == true){
            switch (result2){
			case '+': k = k + Character.getNumericValue(result3); break;
			case '-': k = k - Character.getNumericValue(result3); break;
			case '*': k = k * Character.getNumericValue(result3); break;
			}		  
		  } 
        }
		return k;
	}
	public static boolean isDigit(char ch){
	    return (Character.getNumericValue(ch) == 0 || Character.getNumericValue(ch) == 1 || Character.getNumericValue(ch) == 2 || Character.getNumericValue(ch) == 3
		     || Character.getNumericValue(ch) == 4 || Character.getNumericValue(ch) == 5  || Character.getNumericValue(ch) == 6 || Character.getNumericValue(ch) == 7
			 || Character.getNumericValue(ch) == 8 || Character.getNumericValue(ch) == 9); 
	}	
}