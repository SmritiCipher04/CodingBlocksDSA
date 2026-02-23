public class swapusingarithematicoperator {
  static void swap(int a, int b){
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("after swapping: a = " + a + " and b = " + b);
  }
  public static void main(String[] args) {
      int a = 1;
      int b = 2;
      System.out.println("before swapping: a = " + a + " and b = " +b);
      swap (a, b);
  }
}
