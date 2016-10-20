public class convert_2_5

{
  public static void main(String[] args)
  {
    String str = "10011100";
    String str1 = "156";
		int str2;
		Integer integer;

		str2 = Integer.parseInt(str1);

    System.out.println();
    System.out.println("введенный символ1" + ":" + isDigit(str));
    System.out.println("введенный символ2" + ":" + isDigit(str1));
    System.out.println();
    System.out.println("I : число в десятичном виде" + ":" + convertBinToDec1(str));
    System.out.println("II:число в десятичном виде" + ":" + convertBinToDec2(str));
    System.out.println();
    System.out.println("I :число в двоичном виде" + ":" + convertDecToBin1(str2));
    System.out.println("II:число в двоичном виде" + ":" + convertDecToBin2(str2));

  }

    public static int convertBinToDec1(String binary)
    {
      int sum = 0;
      for(int i = binary.length()-1 ; i >= 0 ; i--)
      {
        int j = Integer.parseInt(binary.charAt(i) + "");//binary.charAt(i);
        if (j != 0)
        {
          int k = power(2, (binary.length()-1)-i);
          sum = sum + k;
        }
      }
      return sum;
    }

    public static int convertBinToDec2(String binary)
    {
      int k = 0;
      for(int i = 0; i <= binary.length()-1; i++)
      {
        int j = binary.charAt(i);
        if(j == '0')
        {
          j = 0;
          k = k * 2 + j;
        }
        else
        {
          j = 1;
          k = k * 2 + j;
        }
      }
      return k;
    }

    public static String convertDecToBin1(int a) //????
    {
      int ost;
      int ms;
      StringBuilder ans = new StringBuilder();

      while(a > 0)
      {
        ost = a % 2;
        a = a / 2;
        ans.append("");
        ans.append(ost);
      }
      return ans.reverse().toString();
    }

    public static String convertDecToBin2(int a)
    {
      StringBuilder ans = new StringBuilder();

      int j = 0, k = 0;
      ans.append("");
      while(a != 0)
      {

        int i = 0;
        while(a >= power(2, i))
        {
          i=i+1;
        }
        i=i-1;
        a = a - power(2, i);

        if(j < i)
        {
          k=0;
        }
        else
        {
          k=j-i; //кол.0
        }

        j=i; //пред.степень
        for(int c=k-1;c>0;c--) //запол.0
        {
          ans.append("");
          ans.append(0);
        }
        if (a==0&&i==1) {
          k=0;

        }
        ans.append("");
        ans.append(1); //запол.0

      }
      for(int c=k;c>=0;c--) //остав.0
      {
        ans.append("");
        ans.append(0);
      }
      return ans.toString();
    }

    public static int power(int a, int b)
    {
      int t = a;
      if( b == 0) return 1;
      for (int r = 1; r < b; r++)
      {
        a = a * t;
      }
      return a;
    }

    public static boolean isDigit(String binary)
    {
      boolean k = false;
       for (int i = binary.length()-1 ; i >= 0 ; i--)
       {
         int s = binary.charAt(i);
         if(s >= '0' && s <= '9')
         {
           k = true;
         }
         else
         {
           return false;
         }
       }
       return k;
     }
   }
