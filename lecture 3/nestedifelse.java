import java.util.Scanner;
public class nestedifelse {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to win the lottery: ");
    int n = sc.nextInt();
    if ( n >= 300 && n<=460){
      if (n >= 300 && n <= 380){
        System.out.println("You won a Macbook M1 Air!!");
      }
      else if ( n >= 381 && n <= 460) {
        System.out.println("You won a Macbook M2 Air!!");
      }
    }
    else if ( n >= 200 && n<=280){
      if ( n >= 200 && n <= 240){
        System.out.println("You won a Chilli Kurkure packet!!");
      }
      else if ( n >= 241 && n <= 280){
        System.out.println("You won a Onion Kurkure packet !!");
      }
    }
    else if ( n >= 1100 && n <=1500){
      if ( n >= 1100 && n <= 1300){
        System.out.println("Congrats!! you won a Cycle. Brand: Avon");
      }
      else if ( n >= 1301 && n <= 1500){
        System.out.println("Congrats!! you won a Cycle. Brand: Hero");
      }
    }
    else if ( n > 50 && n <= 80){
      if ( n > 50 && n <= 65){
        System.out.println("Congrats!! you won a Bike. Model: Bullet.");
      }
      else if ( n > 65 && n <= 80){
        System.out.println("Congrats!! you won a Bike. Model: Rajdoot");
      }
    }
    else{
      System.out.println("Better luck next time.");
    }
  }
  
}