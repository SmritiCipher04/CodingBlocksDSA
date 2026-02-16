
public class q1reversenumreturn{
  public static int reverse(int num, int reversed){
    while(num != 0) {
          int digit = num % 10;
          reversed = (reversed * 10) + digit;
          num /= 10;
      }
      return reversed;
  }
  public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Enter the num: ");
      int num = sc.nextInt();
      int reversed = 0;
      int result = reverse(num, reversed);
      System.out.println("the reverse of " + num + " is " + result);
      sc.close();
  }
}
