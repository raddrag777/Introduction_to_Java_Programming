/*Write a program that prompts the user to 
enter the number of sides and their length 
of a regular polygon and displays its area.*/

import java.util.Scanner;

public class Exercise405 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for 
      //and acquire number of sides and their length
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the bumber of sides: ");
      int n = input.nextInt();
      System.out.print("Enter the side: ");
      double s = input.nextDouble();
      
      //Compute the area of the polygon
      double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
      
      System.out.print("The area of the polugon is " + area);
      
   }
}