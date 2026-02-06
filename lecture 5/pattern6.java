import java.util.Scanner;
public class pattern6 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of n: ");
    int n = sc.nextInt();
    int space = n-1;
    int star = 1;
    int row = 1;
    
    //ROWs
    while ( row <= n){
      //Spaces
      int i = 1;
      while (i <= space){
        System.out.print("  ");
        i++;
      }
      //Star
      int j = 1;
      while ( j <= star){
        System.out.print("* ");
        j++;
      }
      //next line update
      System.out.println();
      space --;
      star +=2;
      row ++;
    }
    System.out.println();

  }

}

