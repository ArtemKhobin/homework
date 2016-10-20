package tasks;
class Defaults {
  public static void main(String[] args) {
    FieldDefaultValuesExample example = new FieldDefaultValuesExample();
    System.out.println(example);
  }
}

class FieldDefaultValuesExample {
  byte b;
  short sh;
  int i;
  long l;
  float f;
  double d;
  boolean bool;
  char ch;
  String str; // not a primitive actually

  public String toString() {
    return "byte: " + b + "; short: " + sh + "; int: " + i + "; long: " + l +
    "; float: " + f + "; double: " + d + "; boolean: " + bool + "; char: '" + ch + "'; String: " + str;
  }

}
