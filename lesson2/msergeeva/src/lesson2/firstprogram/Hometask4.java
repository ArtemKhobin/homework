package lesson2.firstprogram;

class Hometask4{

    public static void main(String[] args) {
        //String str = "0101";
        String str = "0000011001000111";
        double i = convert(str);
        System.out.println(i);		 
    }
	
     public static double convert(String binary){
	 double k = 0;
         int n =0;
	 int i = binary.length();
	  for(int j = i-1; j>=0; j--)
	  {
	      char result = binary.charAt(j);
	      if(result == '1')
	      {
	           k = k + Math.pow(2,n);
	       } 
	       n++;
	    }
	    return k;
      }	
}