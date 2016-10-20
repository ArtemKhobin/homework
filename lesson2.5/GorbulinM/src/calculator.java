import java.util.Scanner;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int ch1 = sc.nextInt();
		System.out.println("Введите первый знак операции:");
		String zo1 = sc.next();
		System.out.println("Введите второе число:");
		int ch2 = sc.nextInt();
    System.out.println("Введите второй знак операции:");
		String zo2 = sc.next();
		System.out.println("Введите второе число:");
		int ch3 = sc.nextInt();
		sc.close();

    System.out.println();
    System.out.println("Ваш пример:" + "" + ch1 + zo1 + ch2 + zo2 + ch3);
    System.out.println();
		System.out.println("Результат:" + calc(ch1, zo1, ch2, zo2, ch3));
	}

  public static int calc(int a1, String op1, int a2, String op2, int a3)
  {
    int res=0;

    first:
    switch(op2)
    {
      case "*":
      {
        switch(op1)
        {
          case "+":res= a1 + a2 * a3;
          break;
          case "-":res= a1 - a2 * a3;
          break;
          case "*":res= a1 * a2 * a3;
          break;
          case "/":res= a1 / a2 * a3;
          break;
        }
      }
    }

    second:
    switch(op2)
    {
      case "/":
      {
        switch(op1)
        {
          case "+":res= a1 + a2 / a3;
          break;
          case "-":res= a1 - a2 / a3;
          break;
          case "*":res= a1 * a2 / a3;
          break;
          case "/":res= a1 / a2 / a3;
          break;
        }
      }
    }

    third:
    switch(op2)
    {
      case "+":
      {
        switch(op1)
        {
          case "+":res= a1 + a2 + a3;
          break;
          case "-":res= a1 - a2 + a3;
          break;
          case "*":res= a1 * a2 + a3;
          break;
          case "/":res= a1 / a2 + a3;
          break;
        }
      }
    }

    fourth:
    switch(op2)
    {
      case "-":
      {
        switch(op1)
        {
          case "+":res= a1 + a2 - a3;
          break;
          case "-":res= a1 - a2 - a3;
          break;
          case "*":res= a1 * a2 - a3;
          break;
          case "/":res= a1 / a2 - a3;
          break;
        }
      }
    }

    return res;
  }
}
