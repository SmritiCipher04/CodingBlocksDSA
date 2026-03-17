//leetcode problem: https://leetcode.com/problems/product-of-array-except-self/description/
public class productofarrayindexesoptimized {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4};
      int n = arr.length;
      int product =1;
      for (int i = 0; i < n; i++){
        product *= arr[i];
      }
      System.out.println("Product of all elements in the array is: " + product);
      int[] productarray = new int[n];
      for (int i = 0; i < n; i++){
        productarray[i] = product/arr[i];
      }
      for (int i = 0; i < n; i++){
        System.out.print(productarray[i] + " ");
      }
  }
}
