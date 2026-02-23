public class findarraymember {
  static void find(int[] arr, int key){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == key){
        System.out.println("found at index " + i);
        return;
      }
    }
    System.out.println("not found");
  }
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    find(arr, 3);
  }
}
