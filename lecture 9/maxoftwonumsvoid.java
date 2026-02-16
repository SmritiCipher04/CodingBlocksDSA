
public class maxoftwonumsvoid {
  public static void max ( int a, int b ){
    if ( a > b){
      System.out.println("a is greater.");
    }
    else if (b > a){
      System.out.println("b is greater.");
    }
    else {
      System.out.println("both are equal.");
    }
  }
  public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("enter a: ");
    int a = sc.nextInt();
    System.out.print("enter b: ");
    int b = sc.nextInt();
    max (a,b);
  }
}
