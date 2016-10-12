package task;

class WhileCycleTask {
  public static void main(String[] args) {
    int startYear = 2001;
    int endYear = 2016;

    int currentYear = startYear;

    while ( currentYear <= endYear ) {
      if ( checkLeapYear(currentYear) ) {
        System.out.println(currentYear+" is a leap year");
      }
      currentYear++;
    }
  }

  public static boolean checkLeapYear(int year) {
    return (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) );
  }
}
