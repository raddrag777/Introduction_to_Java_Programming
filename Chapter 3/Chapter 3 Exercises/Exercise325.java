/*Write a program that prompts the user 
to enter four points and displays the 
intersecting point. */

import java.util.Scanner;

public class Exercise325 {
   public static void main(String [] args) {
      
//Create a scanner and prompt user for and 
//acquire coordinates for four points

      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1, x2, y1, y1, x3, y3, x4, y4: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      double x4 = input.nextDouble();
      double y4 = input.nextDouble();

//Calculate a, b, c, d, e, f

      double a = y1 - y2;
      double b = x1 - x2;
      double c = y3 - y4;
      double d = x3 - x4;
      double e = (x1 * (y1 - y2)) - (y1 * (x1 - x2));
      double f = (x3 * (y3 - y4)) - (y3 * (x3 - x4));
      
      double denominator = a * d - b * c;
      
      double intersectingX = (e * d - b * f) / denominator;
      double intersectingY = (a * f - e * c) / denominator;
      
      if (denominator == 0) 
         System.out.println("The two lines are parallel.");
      else
         System.out.println("The intersecting point is (" + intersectingX + ", " + intersectingY + ")");
   }
}