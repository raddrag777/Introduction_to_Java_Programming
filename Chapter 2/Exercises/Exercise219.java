/*Write a program that prompts the user to 
enter three points of a triangle and 
displays its area*/

import java.util.Scanner;

public class Exercise219 {
   public static void main(String [] args) {
      
      //Create scanner and prompt user for three points
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for a triangle: ");
      
      //Acquire three points and calculate area
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      
      //Compute the length of each side
      
      double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), .5);
      double side2 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)), .5);
      double side3 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), .5);
      
      //Compute s using three sides
      double s = (side1 + side2 + side3) / 2;
      
      //Compute area of triangle
      double areaTriangle = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
      
      System.out.print("The area of the triangle is " + areaTriangle);
      
   }  
}