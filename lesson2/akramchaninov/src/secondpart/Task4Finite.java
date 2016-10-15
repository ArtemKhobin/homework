// * Цикл do-while. Выход из цикла break
package secondpart;

class Task4Finite {

  public static void main (String[] args) {
    int count = 0;
    do {
      System.out.println("It doesn't seem that I'm here forever");
      count++;
      if (count == 5) break;
    } while (true);
  }

}
