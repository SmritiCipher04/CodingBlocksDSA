public class arrayminelement {
  static void minelement(int[] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] > arr[j]){
          int min = arr[i];
          arr[i] = arr[j];
          arr[j] = min;
        }
      }
    }
    System.out.println("min element is " + arr[0]);
  }
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 10, 9};
    minelement(arr);
  }
}
