import java.util.Scanner;
public class sumevennumvoid {
  public static void sumOfEvenNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the value of N: "); 
    int N = sc.nextInt(); 
    sumOfEvenNumbers(N); 
    sc.close();
  }
}
