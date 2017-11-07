/*Write a program that prompts the user to 
enter the side of a hexagon and displays its area*/

import java.util.Scanner;
public class Exercise404 {
   public static void main(String [] args) {
      
      
      //Create a scanner and prompt user for and acquire hexagon side
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side of a hexagon: ");
      double s = input.nextDouble();
      
      //Convert degrees to radians
      //double s = toRadians(sDegrees);
      
      //Calculate the area of the hexagon
      double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
      
      System.out.printf("The area of the hexagon is %4.2f", area);
   }
}