//leetcode problem: https://leetcode.com/problems/find-peak-element/description/
import java.util.Scanner;
public class peakindex {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter "+ n +" elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

        for (int i =1; i < n-1; i++){
          if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            System.out.println("\n Peak index is: " + i);
          }
        }
  }
}