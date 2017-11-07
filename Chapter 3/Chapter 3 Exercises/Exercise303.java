/* A linear equation can be solved using Cramer's rule. 
Write a program that prompts the user to enter a, b, c,
d, e, and f and displays the result. */

import java.util.Scanner;

public class Exercise303 {
   public static void main(String [] args) {
      
      //Create a scanner
      Scanner input = new Scanner(System.in);
      
      //Prompt user for a, b, c, d, e, and f and acquire each
      System.out.print("Enter a, b, c, d, e, and f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble(); 
      
      double denominator = a * d - b * c;
      
      if (denominator == 0) {
         System.out.println("The equation has no solution.");
      }   
      else {
      
         //Solve for x and y using Cramer's Rule
         double x = (e * d - b * f) / denominator;
         double y = (a * f - e * c) / denominator;
         
         //Display results
         System.out.println("x is " + x + " and y is " + y);
         
      }
   }
}