/*Write a program that prompts the user to
 enter a point (x, y) and checks whether the 
 point is within the rectangle centered at 
 (0,0) with width 10 and height 5.*/
 
 import java.util.Scanner;
 
 public class Exercise323 {
 
   public static void main(String [] args) {
      
//Create a scanner and prompt user for and acquire coordinates
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a point with two corrdinates: ");
      double x = input.nextDouble();
      double y = input.nextDouble();
      
      if (x > 5 || y > 2.5)
         System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
      
      else if (x < -5 || y < -2.5)
         System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
      
      else 
         System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        
   }
 }