
public class gamequestion {
  public static void main(String[] args) {
      int[] arr = {4, 1, 2, 3, 5};
      int turn =1, A = 0, B = 0;
      int i = 0, j = arr.length-1;
      while(i<=j){
        if(turn == 1){
          if (arr[i]>arr[j]){
            A += arr[i];
            i++;
          }
          else{
            A += arr[j];
            j--;
          }
          turn = 0;
        }
        else{
          if (arr[i]>arr[j]){
            B += arr[i];
            i++;
          }
          else{
            B += arr[j];
            j--;
          }
          turn = 1;
        }
      }
      System.out.println("A: " + A + ", B: " + B);

  }
}
