// leetcode 1: two sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

class myarray { 
  int[] arr;
  //constructor
  myarray(int[] arr){
    this.arr = arr;
  }
  //two sum function
  public int[] twosum(int target){
    
    for (int i = 0; i < arr.length; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] + arr[j] == target){
          return new int[]{i, j};
        }

      }

    }
    return new int[]{-1, -1}; // return -1, -1 if no solution is found
  }

  //display function
  public void display(int[] result){
    System.out.println("indices: " + result[0] + ", " + result[1]); // print the indices of the two numbers that add up to target, return[0] is the index of the first number and return[1] is the index of the second number
  }

}

public class twosum {
  public static void main(String[] args){
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    myarray obj = new myarray(arr);
    int[] result = obj.twosum(target);
    obj.display(result);
  }
  
}
