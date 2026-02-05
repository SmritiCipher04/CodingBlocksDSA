//reverse a number eg. 123 --> 321
import java.util.Scanner;
public class reverse {
  public static void main(String[] args) {
      int num;
      int reversed = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      num = sc.nextInt();

      while(num != 0) {
          int digit = num % 10;
          reversed = (reversed * 10) + digit;
          num /= 10;
      }
      System.out.println("Reversed number: " + reversed);
  }
  
}
