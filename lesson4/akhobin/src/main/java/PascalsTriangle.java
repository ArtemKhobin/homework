package main.java;

import java.util.Arrays;

class PascalsTriangle {
  private int height;
  private int[][] triangle;
  private String filterSubstitute = "_";

  public PascalsTriangle(int height) {
    this.height = height;
    if (height > 0) {
      buildTriangle();
    }
  }

  public void print() {
    //System.out.println("Triangle!" + triangle.length);
    printTriangle("");
  }

  public void print(String filter) {
    printTriangle(filter);
  }

  private void printTriangle(String filter) {
    for (int i = 0, offset = height+1/2; i < height; i++, offset--) {
      for (int j = 0; j < triangle[i].length; j++) {
        System.out.print(" " + filterElement(filter, triangle[i][j])  + " ");
      }
      System.out.println("");
    }
  }

  private String filterElement(String filter, int element) {
    switch (filter) {
      case "ODD":
        return element % 2 == 0 ? Integer.toString(element) : filterSubstitute;
      case "EVEN":
        return element % 2 == 0 ? filterSubstitute : Integer.toString(element);
      default:
        return Integer.toString(element);
    }
  }

  private void buildTriangle() {
    triangle = new int[height][];

    for (int i = 0; i < height; i++) {
      triangle[i] = new int[i + 1];
      fillTriangleRow(i);
    }
  }

  private void fillTriangleRow(int row) {
    for (int i = 0; i <= row; i++) {
      if (i == 0) {
        triangle[row][i] = row > 0 ? triangle[row - 1][0] : 1;
      } else if (i == row) {
        triangle[row][i] = triangle[row - 1][row - 1];
      } else {
        triangle[row][i] = triangle[row - 1][i - 1] + triangle[row - 1][i];
      }
    }
  }
}
