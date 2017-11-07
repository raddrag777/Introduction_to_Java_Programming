/*Write a program that prompts the user to enter 
the length from the center of a pentagon to a 
vertex and computes the area of the pentagon.*/

import java.util.Scanner;
 
public class Exercise401 {
   public static void main(String [] args) {
      
      //Create Scanner and prompt user for and acquire length
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length from the center to a vertex: ");
      double r = input.nextDouble();
      
      //Calculate s -length of the side
      double s = 2 * r * Math.sin(Math.PI / 5);
      
      //Calculate the area of the pentagon
      double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
      
      System.out.printf("%4.2f\n", area);
   }
}