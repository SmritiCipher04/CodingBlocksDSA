/*
Pattern 4:

    * * * * *
        * * * *
            * * *
                * *
                    *
                * *
            * * *
        * * * *
    * * * * *

*/

import java.util.Scanner;
public class testpattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part (including middle)
        for (int i = n; i >= 1; i--) {

            // spaces
            for (int s = 0; s < (n - i) * 5; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = 2; i <= n; i++) {

            // spaces
            for (int s = 0; s < (n - i) * 5; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
