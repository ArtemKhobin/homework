public class convert
{
  public static void main(String[] args)
  {
    String str = "00101";
    System.out.println("число в десятичном виде" + ":" + convert(str));
  }

    public static int convert(String binary)
    {
      int sum = 0;
      for(int i = binary.length()-1 ; i >= 0 ; i--)
      {
        int j = binary.charAt(i);
        if (j != '0')
        {
          int k = (int)Math.pow(2,4-i);
          sum = sum + k;
        }
      }
      return sum;
    }
}
