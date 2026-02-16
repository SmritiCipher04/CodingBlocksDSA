
public class maxoftwonumsreturn {
  public static int max (int a, int b){
    if (a>b){
      return a;
    }
    else if (b>a){
      return b;
    }
      return 0;
    
  }
  public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("enter a: ");
    int a = sc.nextInt();
    System.out.print("enter b: ");
    int b = sc.nextInt();
    int result = max(a,b);
    System.out.println("greater one is " + result);
  }
}
