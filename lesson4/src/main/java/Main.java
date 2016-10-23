package main.java;
class Main {
  public static void main(String[] args) {
    int n = 10; // triangle height
    PascalsTriangle triangle = new PascalsTriangle(n);
    triangle.print();
    triangle.print("EVEN");
    triangle.print("ODD");
  }
}
