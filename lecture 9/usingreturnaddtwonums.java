public class usingreturnaddtwonums {
  public static int add(int a, int b){
    int sum = a+b;
    return sum;
  }
  public static void main(String[] args) {
     java.util.Scanner sc = new java.util.Scanner(System.in);
     System.out.print("enter a: ");
     int a = sc.nextInt();
     System.out.print("enter b: ");
     int b = sc.nextInt();
     int result = add(a,b);
     System.out.println(result);
  }
}