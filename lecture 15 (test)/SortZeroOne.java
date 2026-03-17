public class SortZeroOne {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 0, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer if already 1
            if (arr[left] == 1) {
                left++;
            }

            // Move right pointer if already 0
            else if (arr[right] == 0) {
                right--;
            }

            // Swap if left is 0 and right is 1
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}