package Homework.Lesson2;
class SecondProgramPart2{
    public static void main(String[] args)
    {
// Переменные
System.out.println("=====================================");
		System.out.println("variables");
		int intVar = 10;
		float floatVar = (float) 1.9;
		String src = "string";
		System.out.println(intVar);
		System.out.println(floatVar);
		System.out.println(src);
		
		
//Создание и вызов метода класса (функции). Цикл for.
System.out.println("=====================================");
		System.out.println("Stars");		
		String s = "*****";
		Stars(s);
		System.out.println("Stars For");
		StarsFor(s);
//Операторы ветвления If-else. Цикл while		
System.out.println("=====================================");
		int yearStart = 2001;
		int yearEnd = 2016;
		while (yearStart <= yearEnd){
			System.out.println(yearStart + " " + EarToll(yearStart));
			yearStart++;
		}
 
//Цикл do-while. Выход из цикла break 
System.out.println("=====================================");
		System.out.println("==...==");
		do {
			System.out.println("It seems that I'm here forever");
			break;
		} while (true);
		int dw = 0;
		System.out.println("==5==");
		do {
			System.out.println("It seems that I'm here forever");
			dw++;
			if( dw == 5) break;
		} while (true);		


		}

	public static boolean EarToll(int year){
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			return true;
		}
		else return false;
	}
		public static void Stars(String i){
	
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
	}
	public static void StarsFor(String i){
		for(int j = 0; j<5;j++){
			System.out.println(i);
		}
	}
}