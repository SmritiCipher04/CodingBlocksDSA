import java.util.Scanner;
public class reversenum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number: ");
    int n = sc.nextInt();
    int reversenum = 0;
    while (n != 0){
      int digit = n%10;
      reversenum = (reversenum*10)+digit;
      n = n/10;
    }
    System.out.println("Reversed number: " + reversenum);
    sc.close();
  }
}
