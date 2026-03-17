/*

Pattern 3:

        *
      *   *
    *   *   *
  *   *   *   *

*/

import java.util.Scanner;

public class testPattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int space = n - 1;
        int star = 1;

        // Rows
        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= star; j++) {
                if (j % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            // Update for next row
            System.out.println();
            space--;
            star += 2;
        }
    }
}
