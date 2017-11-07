/*Write a program that prompts the user to enter 
   v in meters/second and the acceleration a in 
   meters/second squared, and displays the 
   minimum runway length*/
   
import java.util.Scanner;

public class Exercise212 {
   public static void main(String [] args) {
      
      //Create a scanner and then prompt user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter speed and acceleration: ");
      
      //Accept input and then calculate runway length
      double velocity = input.nextDouble();
      double acceleration = input.nextDouble();
      
      double length = (velocity * velocity) / (2 * acceleration);
      
      //Display results
      System.out.println("The minimum runway length for this airplane is " + length);
   }
}
   
   
   