import java.util.Scanner;
public class lotterygame {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to win the lottery: ");
    int n = sc.nextInt();
    if ( n >= 300 && n<=460){
      System.out.println("Congratulations! You Won a Macbook!!");
    }
    else if ( n >= 200 && n<=280){
      System.out.println("You won a Kurkure packet!!");
    }
    else if ( n >= 1100 && n <=1500){
      System.out.println("Congrats!! you won a Cycle");
    }
    else if ( n > 50 && n <= 80){
      System.out.println("Congrats!! you won a Bike");
    }
    else{
      System.out.println("Better luck next time.");
    }
  }
  
}
