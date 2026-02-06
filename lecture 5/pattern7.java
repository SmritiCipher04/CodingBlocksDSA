import java.util.Scanner;
public class pattern7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    int space = 0;
    int star = 2*n-1;
    int row = 1;
    while ( row <= n){
      int i=1;
      while ( i <= space){
        System.out.print("  ");
        i++;
      }
      int j = 1;
      while ( j <= star){
        System.out.print("* ");
        j++;
      }
      System.out.println();
      space ++;
      star -= 2;
      row ++;
    }
    
  }
}
