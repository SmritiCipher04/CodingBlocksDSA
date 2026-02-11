import java.util.Scanner;
public class pattern12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter n : ");
    int n = sc.nextInt();
    int space = n-1;
    int star = 1;
    int row = 1;
    while ( row <=(2*n-1) ){
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
      if (row < n){
        star ++;
        space--;
      }
      else{
        star --;
        space++;
      }
      
      row ++;
    }
  }
}
