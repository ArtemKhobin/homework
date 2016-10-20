package tasks;
class BitwiseCalc {
  int length;
  String left, right;

  public static void main(String[] args) {
    BitwiseCalc calc = new BitwiseCalc();
    System.out.println(calc.and("11101111", "10111110"));
    System.out.println(calc.and("11", "101"));

    System.out.println(calc.or("011101110", "10111110"));
    System.out.println(calc.or("11001101110", "10111110"));

    System.out.println(calc.xor("11101110", "10111110"));
    System.out.println(calc.xor("1011011", "1100110"));

    System.out.println(calc.not("11101110"));
    System.out.println(calc.not("10111110"));
  }

  public String and(String binaryLeft, String binaryRight) {
    String result = "";
    processBinaries(binaryLeft, binaryRight);

    for (int i = length - 1; i >= 0; i--) {
      if (left.charAt(i) == right.charAt(i) && left.charAt(i) == '1') {
        result = "1" + result;
      } else {
        result = "0" + result;
      }
    }
    return result;
  }

  public String or(String binaryLeft, String binaryRight) {
    String result = "";
    processBinaries(binaryLeft, binaryRight);

    for (int i = length - 1; i >= 0; i--) {
      if (left.charAt(i) == '1' || right.charAt(i) == '1') {
        result = "1" + result;
      } else {
        result = "0" + result;
      }
    }
    return result;
  }

  public String xor(String binaryLeft, String binaryRight) {
    String result = "";
    processBinaries(binaryLeft, binaryRight);

    for (int i = length - 1; i >= 0; i--) {
      if ((left.charAt(i) == '1' || right.charAt(i) == '1') &&
       (left.charAt(i) != right.charAt(i))) {
        result = "1" + result;
      } else {
        result = "0" + result;
      }
    }
    return result;
  }

  public String not(String binary) {
    String result = "";
    length = binary.length();

    for (int i = 0; i < length; i++) {
      if (binary.charAt(i) == '1') {
        result += "0";
      } else {
        result += "1";
      }
    }
    return result;
  }

  private void processBinaries(String binaryLeft, String binaryRight) {
    int leftLength = binaryLeft.length();
    int rightLength = binaryRight.length();
    length = Math.max(leftLength, rightLength);

    if (leftLength == rightLength) {
      this.left = binaryLeft;
      this.right = binaryRight;
    } else if (leftLength > rightLength) {
      this.left = binaryLeft;
      this.right = createZeroString(leftLength - rightLength) + binaryRight;
    } else {
      this.right = binaryRight;
      this.left = createZeroString(rightLength - leftLength) + binaryLeft;
    }
  }

  private String createZeroString(int length) {
    String str = "";
    for (int i = 0; i < length; i++) {
      str += "0";
    }
    return str;
  }


}
