import java.util.Scanner;
public class shapevolume {
  public static void main(String[] args) {
      double radius, height, volume;
      final double PI = 3.14159;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius of the cylinder: ");
      radius = sc.nextDouble();
      System.out.print("Enter the height of the cylinder: ");
      height = sc.nextDouble();

      volume = PI * radius * radius * height;
      System.out.println("Volume of the cylinder: " + volume);

      
  }
  
}
