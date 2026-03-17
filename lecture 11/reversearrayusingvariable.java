// reverse of an array using variable k (it will shift k times)

public class reversearrayusingvariable {
  static void reversearr(int arr[], int k){
    for (int i = 1; i <= k; i++){
      for (int j = 0; j < arr.length - 1; j++){
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
