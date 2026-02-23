public class swapusingvariable {
  static void swap(int a, int b){
    int temp = a;
    a=b;
    b=temp;
    System.out.println("after swapping a is "+ a + " and b is " + b);
  }
  public static void main(String[] args){
    int a = 10;
    int b = 20;
    System.out.println("before swapping a is "+ a + " and b is "+ b);
    swap(a, b);
  }
}
