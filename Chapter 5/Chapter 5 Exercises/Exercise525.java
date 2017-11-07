/*Write a program that displays the pi value 
for i = 10000, 20000, ..., 100000.*/

public class Exercise525 {
   public static void main(String [] args) {
      
      double pi = 0;
      double i = 1;
      
      while (i < 100001) {
         pi += Math.pow(-1, i + 1) / (2 * i - 1);
         if (i % 10000 == 0) {
            System.out.println("pi at i = " + i + " is " + (pi * 4));
            }
         i++;
      }  
   }       
}
