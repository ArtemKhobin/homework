class DoWhileBreak
{
  public static void main(String[] args)
  {
    int i = 1;
    do
    {
      System.out.println(i + ":" + "It seems that I'm here forever");
      i++;
      if (i == 6) break;
    }
    while(true);
  }
}
