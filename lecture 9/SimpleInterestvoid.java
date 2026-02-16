import java.util.Scanner;
public class SimpleInterestvoid {
  public static void SI(double P, double R, double T) {
    double Simpleinterest = ( P * R * T )/100;
    System.out.println("Simple Interest is: " + Simpleinterest);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principle amount: ");
    double P = sc.nextDouble();
    System.out.print("Enter the Rate of interest: ");
    double R = sc.nextDouble();
    System.out.print("Enter the Time in years: ");
    double T = sc.nextDouble();

    SI (P, R, T);
  }
}
