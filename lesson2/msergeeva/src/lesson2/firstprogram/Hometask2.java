package lesson2.firstprogram;

class Hometask2{

 public static void main(String[] args) {
        int i = 2001;
		while (i <= 2016)
		{
			if (Function(i) == true) 
			{
			    System.out.println(i + " is leap-year");
			} 
			i++;
		}
	    
    }
	
public static boolean Function(int i){
	    if(i % 4 == 0){   
		    if (i % 100 != 0) {
		        return true;	      
		    } else {return(i % 400 == 0);}   
	    } else {return false;}
	}
}