package lessons;
import java.util.Arrays;

public class ArraysUtils {
    public static void print(int[][] arr) { // печатает двумерный массив в консоль
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          //System.out.println(Arrays.toString(arr[i]));
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }

    public static boolean areEqual(int[][] arr1, int[][] arr2) { // возвращает true если двумерные массивы одинаковы.
        if (arr1. length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]. length != arr2[i].length) return false;
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j])
                return false;
            }
        }
        return true;
    }

    public static int[] linearize(int[][] arr) { // "Распрямляет" двумерный массив. Например из {{1, 2}, {1, 2}} делает {1, 2, 1, 2}
        if (arr.length == 0 ) {
            return null;
        }
        int[] result = new int[elementsNumber(arr)];
        int iteration = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            {
                result[iteration] = arr[i][j];
                iteration++;
            }
        }
        return result;
    }

    public static int elementsNumber(int[][] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
              number++;
            }
        }
        return number;
    }

    public static int[][] transpose(int[][] arr) { // Если представить двумерный массив как матрицу из R столбцов и C строк, то результатом будет "матрица" [C][R]
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }

    public static int[][] createSpiral(int n, int m) { // создает и заполняет двумерный массив размерности [n][m] по спирали
      int[][] result = new int[n][m];
      int size = n * m;
      int col = m;
      int row = n;
      int correctY = 0;
      int correctx = 0;
      int count = 1;

       while (col > 0)
       {
         for (int y = 0; y < 4; y++)
         {
           for (int x = 0; x < (( col < row ) ? row : col ); x++)
           {
             if (y == 0 && x < col - correctx && count <= size )
               result[y + correctY][x + correctx] = count++;
             if (y == 1 && x < row - correctY && x != 0 && count <= size)
               result[x + correctY][col - 1] = count++;
             if (y == 2 && x < col - correctx && x != 0 && count <= size)
               result[row - 1][col - (x + 1)] = count++;
             if (y == 3 && x < row - (correctY + 1) && x != 0 && count <= size)
               result[row - (x + 1)][correctY] = count++;
           }
         }
         row--;
         col--;
         correctY += 1;
         correctx += 1;
       }
     return result;
    }

}
