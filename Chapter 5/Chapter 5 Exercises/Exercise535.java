/*Write a program to compute the following summation*/

public class Exercise535 {
   public static void main(String [] args) {
      double sum = 1 / (1 + Math.pow(2, .5));
      double x1 = 2;
      double x2 = 3;
      
      while (x2 <= 625){
      
         double denominator = Math.pow(x1, .5) + Math.pow(x2, .5);
         
         sum = sum + (1 / denominator);
         x1++;
         x2++;
      }
      System.out.println("Summation = " + sum);
      
   }
}