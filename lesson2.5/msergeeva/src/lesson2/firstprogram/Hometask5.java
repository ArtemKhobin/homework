package lesson2.firstprogram;

class Hometask5{

    public static void main(String[] args) {
        //String str = "0101";
        String str = "0000011001000111";
        int i = convertBinToDec2(str);
        System.out.println("The decimal number is " + i);		 
    }
	
    public static int convertBinToDec2(String binary){
	    int k = 0;
	    int i = binary.length();
	    for(int j = 0; j <= i-1; j++)
	    {
	      char result = binary.charAt(j);
		  int n = Character.getNumericValue(result);
	      if(n == 1 || n == 0)
	      {
	           k = k * 2 + n;
	       } 
	    }
	    return k;
    }	  
}