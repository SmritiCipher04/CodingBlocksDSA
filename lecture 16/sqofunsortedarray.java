import java.util.Arrays;
class myarray {
  int[] arr;

  //constructor to initialize the array and its size
  int size;
  myarray(int[] arr){
    this.arr = arr;
    this.size = arr.length;
  }

  //function to calculate the running sum of the array
  public void sqarearray(){
    for(int i = 0; i < arr.length; i++){
      arr[i] = arr[i] * arr[i]; 
    }
    Arrays.sort(arr); // sort the array after squaring to get the squares in sorted order
  }
  //function to display the array
  public void display(){
    for (int i =0; i < arr.length; i++){
      System.out.print(arr[i]+ " "); 
    }
    System.out.println();
  }
}

public class sqofunsortedarray {
  public static void main (String[] args){
    int[] arr = {-4, -2, 0, 3, 10};
    myarray obj = new myarray(arr);

    System.out.print("original array: ");
    obj.display();

    obj.sqarearray();

    System.out.print("\narray with squares: ");
    obj.display();
  }
  
}
