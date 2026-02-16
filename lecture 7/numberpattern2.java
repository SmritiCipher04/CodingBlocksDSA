/* 

  5 4 3 2 *
  5 4 3 2 1
  5 4 3 2 1
  5 4 3 2 1
  * 4 3 2 1

*/
import java.util.Scanner;
public class numberpattern2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a num: ");
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++){
        for(int j = 5; j >= 1; j--){
          if ( i == 1 && j == 1){
            System.out.print("* ");
          }
          else if( i == 5 && j == 5){
            System.out.print("* ");
          }
          else{
            System.out.print(j + " ");
          }
          
        }
        System.out.println();
      }
  }
}