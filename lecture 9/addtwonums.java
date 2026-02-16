//Using void method to add two numbers and print the result
import java.util.*;
public class addtwonums {
  public static void add(int a, int b){
    int sum = a + b;
    System.out.println(sum);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a: ");
      int a = sc.nextInt();
      System.out.print("enter b:");
      int b =sc.nextInt();
      add(a,b);
  }
}


