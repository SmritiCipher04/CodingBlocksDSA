import java.util.*;
public class inverseofanarray {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){

        arr[i] = sc.nextInt(); 
    }
    
    int[] inverse = new int[n];
    for(int i=0; i<arr.length; i++){
        int val = arr[i];
        inverse[val] = i;
    }
    for (int i : inverse){
        System.out.print(i + " ");
    }
    
  }
}

    