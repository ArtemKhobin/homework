// * Операторы ветвления If-else. Цикл while
package secondpart;

class Task3 {

  public static void main (String[] args) {
    int year = 2001;
    while (year <= 2016) {
      if (leapYear(year)) {
        System.out.println(year + " is a leap year");
      } else {
        System.out.println(year + " is not a leap year");
      }
      year++;
    }
  }

  static boolean leapYear (int i) {
    if (i % 4 == 0) {
      if (i % 100 != 0 || i % 400 == 0) {
        return true;
      } else return false;
    } else return false;
  }

}
