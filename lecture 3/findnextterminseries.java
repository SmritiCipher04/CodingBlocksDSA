//Arithematic progression series
import java.util.Scanner;
public class findnextterminseries {
  public static void PrintAP(int a, int d) {
      int currentterm = a;

      for (int i = 1; i <= 50; i++){
        System.out.print(currentterm + " ");
        currentterm += d;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first term : ");
      int a = sc.nextInt(); // first term
      System.out.print("Enter the common difference : ");
      int d = sc.nextInt(); // common difference

      System.out.println("The first 50 terms of the Arithematic Progression series are : ");
      PrintAP(a, d);
  }
  
}
