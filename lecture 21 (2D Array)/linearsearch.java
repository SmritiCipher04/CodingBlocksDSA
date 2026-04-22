import java.util.*;
public class linearsearch {
  public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int[][] arr = new int[m][n];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt();
        }

      }
      for (int i = 0; i < m; i++) {
        System.out.println(Arrays.toString(arr[i]));
      }
      int target = sc.nextInt();
      boolean found = false;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i][j] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            break;
        }
      }
      if (found) {
          System.out.println("Target found");
      } else {
          System.out.println("Target not found");
      }
  }
}
