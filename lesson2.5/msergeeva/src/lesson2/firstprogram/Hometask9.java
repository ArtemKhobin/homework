package lesson2.firstprogram;

class Hometask9{

    public static void main(String[] args) {
		//String str = "2+2*2"; // 6
		String str = "2+2*2+3*3"; // 15
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
		  char result4 = expression.charAt(j+2);
		  char result5 = expression.charAt(j+3);
		  if(isDigit(result2) != true && isDigit(result3) == true){
		    int n = Character.getNumericValue(result3);
		    if(result4 == '*'){
			   n = Character.getNumericValue(result3) * Character.getNumericValue(result5);			   
			}
            switch (result2){
			case '+': k = k + n; break;
			case '-': k = k - n; break;
			case '*': k = k * n; break;
			}
			j = j + 2;
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