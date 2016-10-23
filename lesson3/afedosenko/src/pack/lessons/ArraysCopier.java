package pack.lessons;

import java.util.Arrays;

public class ArraysCopier {
  int[] arrayint;

  public ArraysCopier(int[] arrayint) {
    this.arrayint = arrayint;
  }

  public int[] copyOf(int newLength) { // возвращает новый массив указанной длины.
    if (newLength <= 0 || newLength > this.arrayint.length)
      return null;

    int[] buf = new int[newLength];
    for (int i = 0; i < newLength; i++) {
      buf[i] = this.arrayint[i];
    }
    return buf;
  }

  public int[] copyOfRange(int from, int to) { // возвращает новый массив начиная с элемента from до элемента to
    if (from < 0 || from > this.arrayint.length || to < 0 || to >= this.arrayint.length || from > to)
      return null;

      int len = to - from + 1;
      int[] buf = new int[len];
      for (int i = 0; i < len; i++) {
        buf[i] = this.arrayint[i + from];
      }
      return buf;
  }

  public int[] fill(int value) { // возвращает новый массив заполненный значением параметра value
        int len = this.arrayint.length;
        int[] buf = new int[len];
        for (int i = 0; i < len; i++) {
          buf[i] = value;
        }
        return buf;
  }

  public static void main(String[] args) {
    int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArraysCopier ar = new ArraysCopier(input);

    System.out.println("--- Lesson3. Task 4. Arrays.");
    System.out.println("-- copyOf(int newLength) method:");
    System.out.println("copyOf(10) = " + Arrays.toString(ar.copyOf(10)));
    System.out.println("copyOf(5) = " + Arrays.toString(ar.copyOf(5)));
    System.out.println("copyOf(0) = " + Arrays.toString(ar.copyOf(0)));
    System.out.println("copyOf(-3) = " + Arrays.toString(ar.copyOf(-3)));

    System.out.println("-- copyOfRange(int from, int to) method:");
    System.out.println("copyOfRange(0, 9) = " + Arrays.toString(ar.copyOfRange(0, 9)));
    System.out.println("copyOfRange(2, 7) = " + Arrays.toString(ar.copyOfRange(2, 7)));
    System.out.println("copyOfRange(9, 9) = " + Arrays.toString(ar.copyOfRange(9, 9)));
    System.out.println("copyOfRange(1, 10) = " + Arrays.toString(ar.copyOfRange(1, 10)));
    System.out.println("copyOfRange(-2, 6) = " + Arrays.toString(ar.copyOfRange(-2, 6)));
    System.out.println("copyOfRange(5, 2) = " + Arrays.toString(ar.copyOfRange(5, 2)));

    System.out.println("-- fill(int value) method:");
    System.out.println("fill(1) = " + Arrays.toString(ar.fill(1)));
    System.out.println("fill(13) = " + Arrays.toString(ar.fill(13)));
  }

}
