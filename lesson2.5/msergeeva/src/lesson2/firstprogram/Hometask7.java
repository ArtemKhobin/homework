package lesson2.firstprogram;

class Hometask7{

    public static void main(String[] args) {
        //int number = 156; // 10011100
		//int number = 5;   // 101
        int number = 1607;  // 11001000111
        String i = convertDecToBin2(number);
        System.out.println("The binary number is " + i);		 
    }
	
    public static String convertDecToBin2(int decimal){
	    String str = "";
	    int k = decimal;
		int i = 0;
		int n = 0;
	    while (i < decimal){
            i = power(2,n);
            n++;			
		}
		    for(int j = n-2; j >= 0; j--){
			   i = power(2,j);
			   if(k >= i){
			    str = str + "1";
				k = k - i;
				} else{
			    str = str + "0";
			   }   
			}
	    return str;
	}
    
    public static int power(int a, int b){
	    int i = 1;
		for(int j = 0; j < b; j++){
	        i = i * a;			
		}
		return i;
	}	
}