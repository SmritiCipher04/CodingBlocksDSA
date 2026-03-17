public class patterntest {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }
}