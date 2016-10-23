package main.java;

class Main {
  public static void main(String[] args) {
    int n = 10; // triangle height
    // PascalsTriangle triangle = new PascalsTriangle(n);
    // triangle.print();
    // triangle.print("EVEN");
    // triangle.print("ODD");

    int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] array2 = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] array3 = {{1,3,5}, {2,4,6}};

    //System.out.println(ArraysUtils.areEqual(array1, array2));
    //ArraysUtils.print(ArraysUtils.linearize(array1));

    //ArraysUtils.print(array1);

    //ArraysUtils.print(ArraysUtils.transpose(array3));

    ArraysUtils.print(ArraysUtils.createSpiral(7, 8));
  }
}
