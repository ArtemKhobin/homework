package lesson2.firstprogram;

class Hometask4{

    public static void main(String[] args) {
        String str = "0101";
        //String str = "0000011001000111";
        int i = convertBinToDec1(str);
        System.out.println("The decimal number is " + i);		 
    }
	
    public static int convertBinToDec1(String binary){
	    int k = 0;
        int n =0;
	    int i = binary.length();
	    for(int j = i-1; j >= 0; j--)
	    {
	      char result = binary.charAt(j);
	      if(result == '1')
	      {
	           k = k + power(2,n);
	       } 
	       n++;
	    }
	    return k;
      }
    public static int power(int a, int b){
	    int i = 1;
		for(int j = 0; j < b; j++){
	        i = i * a;			
		}
		return i;
	}	  
}