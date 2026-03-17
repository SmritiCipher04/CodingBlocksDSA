public class printindexofarrayofgivensum {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int target = 9;
      for (int i = 0; i < arr.length; i++) {
          for (int j = i + 1; j < arr.length; j++) { // Start j from i + 1 to avoid repeating pairs and self-pairing
              if (arr[i] + arr[j] == target) {
                  System.out.println("Indices: " + i + ", " + j);
              }
          }
      }
  }
}

//leetcode questions solved in 9th march 2026
// trapped rain water
// first bad version
// maximum subarray sum