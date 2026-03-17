//rotate an array leetcode problem: https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;
import java.util.Scanner;
public class rotateanarray {
  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n; // handle cases where k is greater than n
    reverse(nums, 0, n - 1); // reverse the entire array
    reverse(nums, 0, k - 1); // reverse the first k elements
    reverse(nums, k, n - 1); // reverse the remaining n-k elements

    System.out.println(Arrays.toString(nums));
  }
  void reverse ( int[] nums, int s, int e){
    while (s<e) {
      int temp = nums [s];
      nums [s] = nums[e];
      nums[e] = temp;
      s++;
      e--;
    }
  }

  int[] nArr;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("enter " +n+ " elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("enter the value of k: ");
    int k = sc.nextInt();

    rotateanarray obj = new rotateanarray();
    obj.rotate(arr, k);
    
    sc.close();
  }

}
