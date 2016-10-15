// * Создание и вызов метода класса (функции). Цикл for.
package secondpart;

class Task2 {

  public static void main (String[] args) {
    // 5 раз
    writeLine();
    writeLine();
    writeLine();
    writeLine();
    writeLine();
    System.out.println();
    // в цикле for
    for (int j = 0; j < 5; j++) {
      writeLine();
    }
  }

  static void writeLine () {
    System.out.println("*****");
  }
}
