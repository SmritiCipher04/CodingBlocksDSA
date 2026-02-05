import java.util.Scanner;

public class pattern5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
    System.out.print("Enter col : ");
		int col = sc.nextInt();
    System.out.println("Using for loop");
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) 
				if((i==1 || i==col) || (j==1 || j==col))
					System.out.print("* ");
				else
					System.out.print("  ");
			
			System.out.println();
    }
    System.out.println("Using while loop");
    int i = 1;
    while (i <= row) {
      int j = 1;
      while (j <= col) {
        if ((i == 1 || i == row) || (j == 1 || j == col))
          System.out.print("* ");
        else
          System.out.print("  ");
        j++;
      }
      System.out.println();
      i++;
    }
    
  
  }
}