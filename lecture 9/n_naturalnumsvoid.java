import java.util.Scanner;
public class n_naturalnumsvoid {
  public static void naturalnums (int n){
    int sum = 0;
    for (int i = 1; i <= n; i++){
      sum = sum + i;

    }
    System.out.println("the sum of natural numbers : " + sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    naturalnums(N);
    sc.close(); 
  }
}
