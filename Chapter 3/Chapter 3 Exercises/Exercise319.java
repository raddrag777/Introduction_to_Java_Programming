/*Write a program that reads three edges for a triangle 
and computes the perimeter if the input is valid. 
Otherwise, display that the input is invalid. 
The input is valid if the sum of every pair 
of two edges is greater than the remaining edge.*/

import java.util.Scanner;

public class Exercise319 {
   public static void main(String [] args) {
      
      //Create a scanner and request and acquire three sides of triangle
      Scanner input = new Scanner(System.in);
      System.out.print("Triangle side 1: ");
      double side1 = input.nextDouble();
      System.out.print("Triangle side2: ");
      double side2 = input.nextDouble();
      System.out.print("Triangle side3: ");
      double side3 = input.nextDouble();
      
      //Determine if sides are viable
      if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
         System.out.println("Triangle perimeter is: " + (side1 + side2 + side3));
      else
         System.out.println("Side lengths are not valid.");
   }  
}