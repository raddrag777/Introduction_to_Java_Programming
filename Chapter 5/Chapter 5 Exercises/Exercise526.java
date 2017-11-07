/*Write a program that displays the e value 
for i = 10000, 20000, ..., 100000.*/

public class Exercise526 {
   public static void main(String [] args) {
      
      double i = 1;
      double e = 0;
      double p = 1;
      
      while (i < 100001) {
         p /= i;
         e += p; 
         if (i % 10000 == 0) {
            System.out.println("e at i = " + i + " = " + e);            
         }
      i++;
      }
   }
}