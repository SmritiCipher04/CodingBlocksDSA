/* Pattern to be printed


* * * *  * * * *
* * *      * * *
* *          * *
*              *

*              *
* *          * *
* * *      * * *
* * * *  * * * *

 */
import java.util.Scanner;

public class pattern10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows: ");
    int n = sc.nextInt();
    int star = n-1;
    int space = 1;
    int row = 1;

    while (row <= 2*n-1){
      //star
      int i = 1;
      while (i <= star){
        System.out.print("* ");
        i++;
      }

      //space
      int j = 1;
      while (j <= space){
        System.out.print("  ");
        j++;
      }
      
      // star
      int k = 1;
      while (k <= star){
        System.out.print("* ");
        k++;
      }
      System.out.println();
      if(row<n){
      star --;
      space += 2;
    }
    else{
      star++;
      space-=2;
    }
      row ++;
    }
  }
  
}
