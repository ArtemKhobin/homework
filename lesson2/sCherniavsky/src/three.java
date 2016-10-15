package some.program;

class three {
    public static void main(String[] args) {
      
	  ifVis();
	}
	  
     public static void ifVis()
	 {
	  int i=2001;
	  System.out.println("высокосные года:");
	 while (i<=2016){ if (i % 4 == 0 || i % 400 == 0 && i % 100 != 0) System.out.println(i); i++;}
         }

   
}
