//leetcode problem: https://leetcode.com/problems/product-of-array-except-self/description/
public class productofarrayindexes {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4};
      int n = arr.length;
      
      int[] productArray = new int[n];
      for (int i = 0; i <= n-1; i++){
        int product = 1;
        for (int j = 0; j < n; j++){
          if(j!=i){
            product *= arr[j];
          }

        }
        productArray[i] = product;
      }
      for (int i = 0; i < n; i++){
        System.out.print(productArray[i] + " ");
      }

  }
}
