/*
Project name: "Homework Second part"
23.10.2016
*/
public class MethodForloop {
  public static void main(String[] args) {
    stars();
    stars();
    stars();
    stars();
    stars();

    System.out.println(" __________________________________________");
    System.out.println();

    starsFor();
  }
  public static void stars() {
    String str = "*****";
    System.out.println(str);
  }
  public static void starsFor() {
    String str = "*****";
    for(int i = 0; i < 5; i++) {
      System.out.println(str);
    }
  }
}
