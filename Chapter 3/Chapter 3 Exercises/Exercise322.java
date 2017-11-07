/*Write a program that prompts the user to 
enter a point(x, y) and checks whether the 
point is within the circle centered at (0,0) 
with radius 10. */

import java.util.Scanner;

public class Exercise322 {
   public static void main(String [] args) {
      
//Create a scanner and prompt user for and acquire x and y
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x = input.nextDouble();
      double y = input.nextDouble();
      
//Declare and initialize variables
      double RADIUS = 10;
      double distance = 0;
      
//Calculate distance from center
      distance = Math.pow((x * x + y * y), .5); 
      
//Display results
      System.out.print("Point (" + x + ", " + y + ") is ");
      if (distance < RADIUS)
         System.out.print("in the circle");
      else
         System.out.print("not in the circle");
      
   }
} 