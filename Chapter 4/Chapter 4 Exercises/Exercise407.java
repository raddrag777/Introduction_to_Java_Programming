/*Suppose a pentagon is centered at (0, 0) 
with one point at the 0 o'clock position. 
Write a program that prompts the user to enter 
the radius of the bounding circle of a pentagon 
and displays the coordinates of the five corner 
points on the pentagon.*/

import java.util.Scanner;

public class Exercise407 {
   public static void main(String [] args) {
      
      //Create scanner and request and acquire radius
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius of the bounding circle: ");
      double r = input.nextDouble();
      
      //Find side of pentagon
      double s = 2 * r * Math.sin(Math.PI / 5);
      
      
   }
}