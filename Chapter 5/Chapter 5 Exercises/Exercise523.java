/*Write a program that compares the 
results of the summation of a series, 
computing from left to right and from 
right to left with n = 500000.*/

public class Exercise523 {
   public static void main(String [] args) {
      double n = 50000;
      double sumLtoR = 0;
      double n2 = 1;
      double sumRtoL = 0;
      
      while (n > 0) {
         sumRtoL = sumRtoL + (1 / n);
         n--;
      }
      System.out.println("Sum of numbers R to L: " +sumRtoL);
     
      while (n2 <= 50000) {
         sumLtoR = sumLtoR + (1 / n2);
         n2++;
      }
      System.out.println("Sum of numbers L to R: " + sumLtoR);
      System.out.println("Difference between sums: " + (sumRtoL - sumLtoR));
      
   }  
}