import java.util.Scanner;
public class naturalnum {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    int sum = 0;
    for (int i = 1; i<=N; i++){
      sum = sum + i;
    }
    System.out.println("the sum of natural numbers : " + sum);
    sc.close();
  }
  
}
