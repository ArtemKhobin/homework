public class IfElseWhile
{
  public static void main(String[] args)
  {

    IfElse(3);
    System.out.println();
    While();

  }

  public static void IfElse(int month)
      {
        if(month == 1 || month == 2 || month == 12)
        {
          System.out.println("Зима");
        }
        else if(month == 3 || month == 4 || month == 5)
        {
          System.out.println("Весна");
        }
        else if(month == 6 || month == 7 || month == 8)
        {
          System.out.println("Лето");
        }
        else if(month == 9 || month == 10 || month == 11)
        {
          System.out.println("Осень");
        }
        else
        {
          System.out.println("Вы с какой планеты?");
        }

      }

    public static void While()
    {
      int year = 2001;
      while (year <= 2016)
      {
        if(isLeapYear(year))
        {
          System.out.println( year + "-" + "високосный год");
        }
        else
        {
          System.out.println(year + "-" + "не високосный год");
        }
        year++;
      }
    }

    public static boolean isLeapYear (int year)
    {
        return (year % 4 == 0 && year % 100 !=0 || year % 400 == 0);
    }
  }
