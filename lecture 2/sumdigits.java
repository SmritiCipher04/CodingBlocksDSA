public class sumdigits {
  public static void main(String[] args) {
      int num;
      int sum = 0;

      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Enter a number: ");
      num = sc.nextInt();

      while(num != 0) {
          int digit = num % 10;
          sum += digit;
          num /= 10;
      }
      System.out.println("Sum of digits: " + sum);
  }
  
}
