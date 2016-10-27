
import lessons.TrianglePascal;
import lessons.ArraysUtils;
import java.util.Arrays;


public class MainProgramm {
  public static void main(String[] args) {
    System.out.println("--- Andrey Fedosenko. Homework. Lesson 4.");
    System.out.println("-- Part 1. Pascal`s triangle.");
    TrianglePascal tp = new TrianglePascal(10);
    tp.print();
    tp.print("EVEN");
    //tp.print("ODD");
    tp.print("FILTER");

    System.out.println("-- Part 1. ArraysUtils.");
    int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    int[][] arr2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    int[][] arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    ArraysUtils.print(arr1);
    System.out.println();
    ArraysUtils.print(arr2);
    if(ArraysUtils.areEqual(arr1, arr2)) {
      System.out.println("Input arrays are EQUAL");
    }
    else {
      System.out.println("Input arrays are NOT EQUAL");
    }
    System.out.println("-- Part 1. ArraysUtils. Linearize.");
    int[] arr4 = ArraysUtils.linearize(arr3);
    System.out.println(Arrays.toString(arr4));

    System.out.println("-- Part 1. ArraysUtils. Transpose.");
    int[][] arr5 = ArraysUtils.transpose(arr3);
    ArraysUtils.print(arr3);
    System.out.println();
    ArraysUtils.print(arr5);

    System.out.println("-- Part 1. ArraysUtils. Spiral.");
    int[][] arr6 = ArraysUtils.createSpiral(8, 9);
    ArraysUtils.print(arr6);
  }

}
