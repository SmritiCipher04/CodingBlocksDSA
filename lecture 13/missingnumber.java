//leetcode problem: https://leetcode.com/problems/missing-number/description/
import java.util.Scanner;
public class missingnumber {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n*(n+1)/2;
    for (int i = 0; i < n; i++){
      sum -= nums[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
      int[] nums = new int[n];
      System.out.print("Enter " + n + " elements:");
      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }

      missingnumber obj = new missingnumber();
      int missing = obj.missingNumber(nums);
      System.out.println("missing number is: " + missing);
  }
  
}
