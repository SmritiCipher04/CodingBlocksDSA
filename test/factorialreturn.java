public class factorialreturn {
  public static int factorial(int num, int fact){
    for(int i = 1; i <= num; i++) {
          fact = fact * i;
    }
    return fact;
  
  }
  public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("enter a number: ");
      int num = sc.nextInt();
      int fact = 1;
      int result = factorial(num, fact);
      System.out.println("the factorial of " + num + " is " + result);
      sc.close();
  }

}
