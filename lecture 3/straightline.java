import java.util.Scanner;
public class straightline {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter x1: ");
     int x1 = sc.nextInt();
     System.out.print("Enter y1: ");
     int y1 = sc.nextInt();
     System.out.println("("+ x1 + " , " + y1 + ")" );

     System.out.print("Enter x2: ");
     int x2 = sc.nextInt();
     System.out.print("Enter y2: ");
     int y2 = sc.nextInt();
     System.out.println("("+ x2 + " , " + y2 + ")" );

    System.out.print("Enter x3: ");
     int x3 = sc.nextInt();
     System.out.print("Enter y3: ");
     int y3 = sc.nextInt();
     System.out.println("( "+ x3 + " , " + y3 + " )" );

     int m1 = (y2 - y1)/(x2 - x1);
     int m2 = (y3 - y2)/(x3 - x2);

     if ( m1 == m2){
      System.out.println("Coordinates exist on a Straight Line.");
     } else{
      System.out.println("Coordinates doesn't exist on a Straight line.");
     }

  }
  
}
