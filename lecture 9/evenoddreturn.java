import java.util.Scanner;
public class evenoddreturn {
  public  static String evenodd (int n){
    if (n%2 == 0){
      return "even";

    }
    else {
      return "odd";

    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number: ");
    int n = sc.nextInt();
    String result = evenodd(n);
    System.out.println(result);
  }
}
