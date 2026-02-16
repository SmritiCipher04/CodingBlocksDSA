/* 
  * * * * * * * * *
  * * * *   * * * *
  * * *       * * *
  * *           * *
  *               *
*/
public class pattern4 {
  public static void main(String[] args) {

        int n = 5;          // total rows
        int totalStars = 9; // stars in first row
        int i = 1;

        while (i <= n) {

            // LEFT STARS
            int left = totalStars - (i - 1);
            int j = 1;
            while (j <= left) {
                System.out.print("* ");
                j++;
            }

            // MIDDLE SPACES
            int spaces = 2 * (i - 1) - 1;
            int k = 1;
            while (k <= spaces) {
                System.out.print("  ");
                k++;
            }

            // RIGHT STARS (avoid duplicate first row)
            if (i != 1) {
                int right = totalStars - (i - 1);
                int m = 1;
                while (m <= right) {
                    System.out.print("* ");
                    m++;
                }
            }

            System.out.println();
            i++;
        }
    }
}
