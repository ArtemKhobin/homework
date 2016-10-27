/*
Project name: "Homework Second part"
23.10.2016
*/
public class While {
  public static void main(String[] args) {
    int i = 2001;
    while(i <= 2016) {
      if(year(i)) {
        System.out.println(i + " - is a leap year.");
      } else {
        System.out.println(i + " - is not a leap year.");
      }
      i++;
    }
  }
  public static boolean year(int i) {
    return(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0));
  }
}
