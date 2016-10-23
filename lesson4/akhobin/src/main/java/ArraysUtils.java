package main.java;

import java.util.Arrays;

class ArraysUtils {
  public static boolean areEqual(int[][] arr1, int[][] arr2) {
    int length = arr1.length;
    if (length != arr2.length) return false;

    for (int i = 0; i < length; i++) {
      if (Arrays.equals(arr1[i], arr2[i]) != true) return false;
    }

    return true;
  }

  public static int[] linearize(int[][] arr) {
    int arrayLength = 0;

    for (int i = 0; i < arr.length; i++) {
      arrayLength += arr[i].length;
    }

    int[] linearizedArray = new int[arrayLength];
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        linearizedArray[index] = arr[i][j];
        index++;
      }
    }

    return linearizedArray;
  }

  public static int[][] createSpiral(int n, int m) {
    if (n <= 0 || m <= 0) return null;

    int[][] spiral = new int[n][m];
    int filler = 1;

    for (int i = 0; i <= n/2 + 1; i++) {
      for (int up = i; up < m; up++) {
        if (spiral[i][up] != 0) continue;
        spiral[i][up] = filler++;
      }

      for (int right = i + 1; right < n; right++) {
        if (spiral[right][m-1] != 0) continue;
        spiral[right][m-1] = filler++;
      }

      for (int down = m - 2; down >= i; down--) {
        if (spiral[n - 1][down] != 0) continue;
        spiral[n - 1][down] = filler++;

      }

      for (int left = n - 2; left > i; left--) {
        if (spiral[left][i] != 0) continue;
        spiral[left][i] = filler++;
      }

      n--;
      m--;
    }

    return spiral;
  }

  public static int[][] transpose(int[][] arr) {
    int[][] transposedArray = new int[arr[0].length][arr.length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        transposedArray[j][i] = arr[i][j];
      }
    }

    return transposedArray;
  }

  public static void print(int[] arr) {
    if (arr == null) return;

    System.out.println(Arrays.toString(arr));
  }

  public static void print(int[][] arr) {
    if (arr == null) return;

    for (int i = 0; i < arr.length; i++) {
      print(arr[i]);
    }
  }


}
