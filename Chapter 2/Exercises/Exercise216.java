/*Write a program that prompts the user to enter 
the side of a hexagon and displays its area.*/

import java.util.Scanner;

public class Exercise216 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for side
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side: ");
      
      //Acquire the side and calculate the area
      double side = input.nextDouble();
      double area = (((3 * Math.pow(3, .5)) / 2) * Math.pow(side, 2));
      
      //Display results
      System.out.println("The area of the hexagon is " + area);
   }
}