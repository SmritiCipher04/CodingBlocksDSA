public class arrraymaxelement {
  static void maxelement(int[] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] < arr[j]){
          int max = arr[i];
          arr[i] = arr[j];
          arr[j] = max;
        }
      }
    }
    System.out.println("max element is " + arr[0]);
  }
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 10, 8};
      maxelement(arr);
  }
}