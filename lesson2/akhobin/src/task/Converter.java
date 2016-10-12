package task;

class Converter {
  public static void main(String[] args) {

    String str = "1011011";

    System.out.println( convert(str) );
  }

  public static int convert(String binary) {
    int result = 0;
    int length = binary.length();

    for (int i = 0; i < length; i++) {
      if ( binary.charAt(i) == '1' ) {
        result += Math.pow(2, (length - 1) - i);
      } else if ( binary.charAt(i) != '0' ) {
        System.out.println("Incorrect number");
        return 0;
      }
    }
    return result;
  }
}
