/* Use a while loop to rind the largest 
integer n such that n3 is less than 12,000.*/

public class Exercise513 {
   public static void main (String [] args) {
      //Declare and initialize variables
      int n = 1;
      double n2 = 1;
      int smallest = 0;
      
      while (n2 < 12001) {
         n++;
         n2 = Math.pow(n, 3);
         if (n2 > smallest)
            smallest = n; 
      }
      System.out.print(
      "The smallest integer n is " + smallest);
   }
}