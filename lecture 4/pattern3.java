import java.util.Scanner;
public class pattern3 {
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
      star ++;
      row ++;
    }
    System.out.println();
    
    System.out.println("USING FOR LOOP");
    for(int i=1; i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for (int k=1; k <= i; k++){
        System.out.print("* ");
      }
      System.out.println();

      
    }

  }

}
