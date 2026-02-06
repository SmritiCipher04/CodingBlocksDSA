import java.util.Scanner;

public class pattern10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows: ");
    int n = sc.nextInt();
    int star = 1;
    int space = 2*n-3;
    int row = 1;

    while (row <= n){
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
      if (row == n){
        star --;
      }
      // star
      int k = 1;
      while (k <= star){
        System.out.print("* ");
        k++;
      }
      System.out.println();
      star ++;
      space -= 2;
      row ++;
    }
  }
  
}
