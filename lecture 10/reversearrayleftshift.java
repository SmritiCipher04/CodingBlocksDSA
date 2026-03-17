// reverse an array (left shift)

public class reversearrayleftshift {
  static void reverse(int arr[], int n) {
    for (int i = 0; i < n-1; i++){
      int temp = arr[i];
      arr [i] = arr[i+1];
      arr[i+1] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    reverse(arr, arr.length);
  }
}