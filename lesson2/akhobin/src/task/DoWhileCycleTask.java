package task;

class DoWhileCycleTask {
  public static void main(String[] args) {

    do {
      if ( (int)(Math.random() * 10) == 7 ) {
        System.out.println("It seems that I've found the exit");
        break;
      }
      foreverPrint();
    } while (true);

  }

  public static void foreverPrint() {
    System.out.println("It seems that I'm here forever");
  }
}
