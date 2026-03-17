
public class selectionsortprogram1 {
  public static void main(String[] args){
    int[] arr = {1,5,6,4,2,3};
    int n = arr.length;
    for (int i = 0; i < n-1; i++){ 
      int mini = i;
      for(int j = i+1; j<n; j++){
        if(arr[j] < arr[mini]){
          mini = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[mini];
      arr[mini] = temp;
    }
    for (int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
