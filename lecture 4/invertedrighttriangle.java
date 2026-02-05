public class invertedrighttriangle {
  public static void main(String[] args){
    System.out.println("USING FOR LOOP.");
    for (int i = 1; i <= 5; i++){
      for (int j = 5; j>=i; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("USING WHILE LOOP.");
    int a = 1;
    while ( a <= 5){
      int b = 5;
      while ( b >= a){
        System.out.print("* ");
        b--;
      }
      System.out.println();
      a++;
    }
  }
  
}
