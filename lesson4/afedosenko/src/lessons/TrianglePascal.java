package lessons;
import java.util.Arrays;

public class TrianglePascal {
  int[][] triangle;
  int height;

  public TrianglePascal(int height) {
    System.out.println("TrianglePascal Class. Height = " + height);
    triangle  = new int[height][];
    this.height = height;
  }

  public boolean isEven(int number) {
      return (number % 2 == 0) ? true : false;
  }

  public void fillTriangle(int height) {
    triangle[0] = new int[] {1};
    triangle[1] = new int[] {1, 1};

    for (int i = 2; i < height; i++) {
        triangle[i] = new int[i+1];
        triangle[i][0] = 1;
        triangle[i][triangle[i].length - 1] = 1;
          for (int j = 1; j < triangle[i].length - 1; j++) {
            triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
        }
    }
  }

  public void print() {
    fillTriangle(height);
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        //System.out.println(Arrays.toString(triangle[i]));
        System.out.print(triangle[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void print(String filter) {
    fillTriangle(height);
    for (int i = 0; i < triangle.length; i++) {
        for (int j = 0; j < triangle[i].length; j++) {
          if (filter.equals("EVEN")) {
              if (isEven(triangle[i][j])) {
                  System.out.print("* ");
              } else {
                  System.out.print(triangle[i][j] + " ");
              }
          } else if (filter.equals("ODD")) {
              if (!isEven(triangle[i][j])) {
                  System.out.print("* ");
              } else {
                  System.out.print(triangle[i][j] + " ");
              }
          }  else {
              System.out.println("Not compatible filter!");
              return;
            }
          }
          System.out.println();
      }
    }
    
}
