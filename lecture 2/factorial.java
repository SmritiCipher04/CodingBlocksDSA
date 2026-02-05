public class factorial {
  public static void main(String[] args) {
      int num;
      int fact = 1;

      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Enter a number: ");
      num = sc.nextInt();

      for(int i = 1; i <= num; i++) {
          fact = fact * i;
      }
      System.out.println("Factorial: " + fact);
  }
  
}
