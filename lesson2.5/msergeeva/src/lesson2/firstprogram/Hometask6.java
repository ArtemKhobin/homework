package lesson2.firstprogram;

class Hometask6{

    public static void main(String[] args) {
        //int number = 156; // 10011100
		//int number = 5;   // 101
        int number = 1607;  // 11001000111
        String i = convertDecToBin1(number);
        System.out.println("The binary number is " + i);		 
    }
	
    public static String convertDecToBin1(int decimal){
	    String str = "";
	    int k = decimal;
	    while (k >= 1){
            if (k % 2 == 0){
		        str = "0" + str;
		    } else {
			    str = "1" + str;
			}
            k = k / 2;			
		}
		int n = str.length();
		if(n < 16){
		    for(int j=0; j < 16-n; j++){
			    str = "0" + str;
			}
		}
	    return str;
    }	  
}