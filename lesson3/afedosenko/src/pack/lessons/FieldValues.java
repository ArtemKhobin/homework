package pack.lessons;

class FieldDefaultValuesExample {
  boolean parambool;
  char paramchar;
  byte parambyte;
  short paramshort;
  int paramint;
  long paramlong;
  float paramfloat;
  double paramdouble;

  public String toString() {
    String str = "boolean: " + String.valueOf(parambool) + "\n";
    str += "char: " + paramchar + "\n";
    str += "byte: " + parambyte + "\n";
    str += "short: " + paramshort + "\n";
    str += "int: " + paramint + "\n";
    str += "long: " + paramlong + "\n";
    str += "float: " + paramfloat + "\n";
    str += "double: " + paramdouble + "\n";
    return str;
  }

  public void setParams(boolean b, char c, byte bt, short sh, int i, long l, float f, double d) {
    this.parambool = b;
    this.paramchar = c;
    this.parambyte = bt;
    this.paramshort = sh;
    this.paramint = i;
    this.paramlong = l;
    this.paramfloat = f;
    this.paramdouble = d;
  }
}

public class FieldValues {
  public static void main(String[] args) {
    System.out.println("--- Lesson3. Task 3. DefaultValues.");
    System.out.println("--Default Values of primitive variables on class members: ");

    FieldDefaultValuesExample fielddefval = new FieldDefaultValuesExample();
    System.out.println(fielddefval.toString());

    System.out.println("--Set values of primitive variables on class members: ");
    fielddefval.setParams(true, 'A', (byte)10, (short)13, 12223, 12312546l, 0.13f, 15.1121212d);
    System.out.println(fielddefval.toString());
  }
}
