/*
Project name: "Homework Second part"
24.10.2016
*/
public class DoWhileBreak {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println("It seems that I'm here forever");
      i++;
      if(i == 10) {
        System.out.println("Oops!");
        break;
      }
    } while(true);
  }
}
