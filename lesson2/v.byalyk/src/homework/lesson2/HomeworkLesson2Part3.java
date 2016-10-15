package Homework.Lesson2;
class SecondProgramPart3{
    public static void main(String[] args)
    {
		String str = "10011011";
		System.out.println( convert(str) );
	}
	public static int convert(String binary) {
		int number = 0, temp = 0, x = 0;
		
		for(int i = binary.length() - 1, j = 1;  i >= 0 ; i-- ){
			
			temp = binary.charAt( i );
			if(temp == '0') x = 0;
			else x = 1;
			number += x*j;
			j = j * 2;
		}

		return number;
    }
}