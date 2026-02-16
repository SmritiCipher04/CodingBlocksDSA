import java.util.Scanner;
public class SimpleInterestreturn {
  public static double SI(double P, double R, double T){
    double Simpleinterest = (P * R * T)/100;
    return Simpleinterest;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the principle amount: ");
    double P = sc.nextDouble();
    System.out.print("enter the rate of interest: "); 
    double R = sc.nextDouble(); 
    System.out.print("enter the time in years: "); 
    double T = sc.nextDouble(); double SI = SI(P, R, T); 
    System.out.println("Simple Interest is: " + SI);
  }
}
