import java.util.Scanner;
public class prog3 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int a = sc.nextInt();
      if( a % 2 == 0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }   
  }
}
