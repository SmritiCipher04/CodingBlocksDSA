import java.util.Scanner;
public class fibonacciseries {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a number: ");
      int n = sc.nextInt();
      int a = 0;
      int b = 1;
      for (int i = 1; i <= n; i++){
        System.out.print(a + " ");
        int c = a + b;
        a = b;
        b = c;
        
      }
      sc.close();
  }
}
