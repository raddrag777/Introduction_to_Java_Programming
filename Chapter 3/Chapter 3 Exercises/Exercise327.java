/*Suppose a right triangle is placed in a plane.
The right=angle point is placed at (0, 0), and 
the other two points are placed at (200, 0), and (100, 0). 
Write a program that ptompts the user to enter a 
point with x- and y-coordinates and determines 
whether the point is inside the triangle.*/

import java.util.Scanner; 

public class Exercise327 {
   
   public static void main(String [] args) {
      
//Create a scanner and aquire users coordinates

      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x = input.nextDouble();
      double y = input.nextDouble();
      
//Determine if user's point is within triangle
      if( (y > 0) && (x > 0) && (x + 2*y < 200) ) 
         System.out.println("The point is in the triangle");
      else
         System.out.println("The point is not in the triangle");
   }
}