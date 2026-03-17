class myarray {
  int[] arr;
  int size;
  myarray(int[] arr){
    this.arr = arr;
    this.size = arr.length;
  }
  public void runningsumfunc(){
    for(int i =1; i < arr.length; i++){
      arr[i] = arr[i]+arr[i-1]; // i-1 is the previous element, we are adding it to the current element to get the running sum at index i
    }

  }
  public void display(){
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

  }

}
public class runningsum {
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4};

    myarray obj = new myarray(arr);
    obj.runningsumfunc();
    obj.display();
  }
}
