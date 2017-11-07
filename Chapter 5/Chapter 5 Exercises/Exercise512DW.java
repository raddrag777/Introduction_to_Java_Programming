/*Use a while loop to find the smallest 
integer n such that n squared is greater 
than 12,000.*/

public class Exercise512DW {
   public static void main(String [] args) {
      //Declare and initialize variables
      int n = 1;
      double n2 = 1;
      double smallest = 1;
            
      do {
         n++;
         //System.out.println(n2);
         n2 = (n * n);
         if (n2 > smallest)
            smallest = n2;      
      } while (n2 < 12000);
      System.out.print(
      "The smallest integer that squared is less than 12,000 is: " + n);
   }
}