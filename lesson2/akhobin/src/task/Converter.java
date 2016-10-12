package task;

class Converter {
  public static void main(String[] args) {

    String str = "-1101010.011";

    System.out.println( convert(str) );
  }

  public static float convert(String binary) {
    // get number sign
    int sign = binary.charAt(0) == '-' ? -1 : 1;
    binary = binary.replace("-", "");

    // Get integer and fractional parts
    String intPart, fractPart = "";
    int dotPosition = binary.indexOf(".");
    if ( dotPosition > -1 ) {
      intPart = binary.substring(0, dotPosition);
      fractPart = binary.substring(dotPosition + 1);
    } else {
      intPart = binary;
    }

    float result = 0;
    // Convert the integer part
    int length = intPart.length();
    for (int i = 0; i < length; i++) {
      if ( intPart.charAt(i) == '1' ) {
        result += Math.pow(2, (length - 1) - i);
      } else if ( intPart.charAt(i) != '0' ) {
        System.out.println("Incorrect number");
        return 0;
      }
    }

    // Convert the fractional part
    length = fractPart.length();
    if ( length > 0 ) {
      for (int i = 0; i < length; i++) {
        if ( fractPart.charAt(i) == '1' ) {
          result += Math.pow(2, (i + 1) * -1);
        } else if ( fractPart.charAt(i) != '0' ) {
          System.out.println("Incorrect number");
          return 0;
        }
      }
    }

    return result * sign;
  }
}
