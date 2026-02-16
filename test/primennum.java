import java.util.Scanner;
public class primennum {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a num: ");
    int n = sc.nextInt();
    for (int i = 2; i <= n; i++) {
      boolean isprime = true;
      for (int j = 2; j < i ; j++) {
        if (i % j == 0) {
          isprime = false;
          break;
        }
      }
      if (isprime == true) {
        System.out.print(i + " ");
      }
      
    }
    sc.close();
  }
  
}
