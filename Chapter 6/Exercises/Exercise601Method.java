/*Write a method with the follwoing header that 
returns a pentagonal number: 
      public static int getPentagonalNumber(int n)
Write a test program that uses this method to 
display the first 100 pentagonal numbers with 
10 numbers on each line. */

public class Exercise601Method {
   public static int getPentagonalNumber(int n) {
      return (int)(n * (3 * n - 1)) / 2;
   }
}
