public class righttrianglepattern {
  public static void main(String[] args){
    //using for loop
    for (int i = 1; i <= 5; i++){
      for (int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    //using while loop
    int k = 1;
    while (k <= 5){
      int l = 1;
      while ( l <=k ){
        System.out.print("*");
        l ++;
      }
      System.out.println();
      k++;
    }
  }
  
}
