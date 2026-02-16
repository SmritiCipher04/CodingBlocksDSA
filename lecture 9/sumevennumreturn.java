import java.util.Scanner;
public class sumevennumreturn {
  public static int sumOfEvenNumbers(int n) { 
    int sum = 0; for (int i = 1; i <= n; i++) { 
      if (i % 2 == 0) { 
        sum += i; 
      } 
    } 
    return sum;
  } 
   public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the value of N: "); 
    int N = sc.nextInt(); 
    int result = sumOfEvenNumbers(N); 
    System.out.println("Sum of even numbers from 1 to " + N + " is: " + result); 
    sc.close(); 
  }
}
