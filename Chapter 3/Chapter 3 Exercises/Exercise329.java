/*Write a programthat prompts the user to
enter the center coordinates and radii 
of two circles and determines whther the 
second circle is inside the first or overlatps 
with the first.*/

import java.util.Scanner;

public class Exercise329 {
   
   public static void main(String [] args) {
   
//Create scanner, prompt user for and aquire center 
//coordinates and radii of two circles

      Scanner input = new Scanner(System.in);
      System.out.print("Enter Circle1's center x- and " + 
         "y-coordinates and radius: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double radius1 = input.nextDouble();
            
      System.out.print("Enter Circle2's center x- and " + 
         "y-coordinates and radius: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double radius2 = input.nextDouble();
      
//Calculate the distance between the two centers

      double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
      
      
      if (distance <= Math.abs(radius1 - radius2))
         System.out.println("Circle 2 is inside circle1.");
      else if (distance <= radius1 + radius2)
         System.out.println("Circle2 overlaps circle1.");
      else 
         System.out.println("Circle2 does not overlap circle1.");
   }
}