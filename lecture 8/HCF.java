import java.util.Scanner;
public class HCF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a: ");
    int a = sc.nextInt();
    System.out.print("enter b: ");
    int b = sc.nextInt();
    int hcf = 1;
    for (int i = 1; i <= a && i <= b; i++){
      if (a%i == 0 && b%i == 0){
        hcf = i;
      }
    }
    System.out.println(hcf);
    System.out.println();
    //while loop :- 1
    System.out.println("using while loop.");
    while (b>0){
      int rem = a%b;
      a = b ;
      b = rem;

    }
    System.out.print(a + " is the hcf");

    System.out.println();
    //while loop :- 2
    System.out.println("using while loop2.");
    while (a%b != 0){
      int rem = a%b;
      a = b;
      b = rem;
    }
    System.out.print(b+ " is the hcf");
  }
}
