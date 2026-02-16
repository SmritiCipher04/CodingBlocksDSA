import java.util.Scanner;
public class evenoddvoid {
  public static void evenodd (int n){
    if (n%2 ==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number: ");
    int n = sc.nextInt();
    evenodd(n);
  }
}
