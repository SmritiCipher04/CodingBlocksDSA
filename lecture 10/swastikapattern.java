/* 

Swastika Pattern

    *       * * * * *
    *       *
    *       *
    *       *
    * * * * * * * * *
            *       *
            *       *
            *       *
    * * * * *       *

*/
import java.util.Scanner;
public class swastikapattern {

  public static void main(String[] args){
    Scanner sc=  new Scanner(System.in);
    System.out.print("enter the value of n: ");
    int n = sc.nextInt();

    int rows = 1;
    while (rows <= n){
      int cols = 1;
      while (cols <= n){
        if (rows == 1){
          if (cols == 1 || cols >=(n+1)/2){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
        }
        else if (rows > 1 && rows < (n+1)/2){
          if (cols == 1 || cols == (n+1)/2){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
        }
        else if (rows == (n+1)/2){
           System.out.print("* ");
        }
        else if (rows > (n+1)/2 && rows < n){
          if (cols == (n+1)/2 || cols == n){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
        }
        else{
          if (cols <= (n+1)/2 || cols == n){
           System.out.print("* ");
          }
          else{
           System.out.print("  ");
          }
        }
      
        cols++;
      }
      System.out.println();
      rows++;

    }
  }
}
