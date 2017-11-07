/*Write a program that prompts the user to 
enter two point and displays the distance 
between them*/
import java.util.Scanner;

public class Exercise215 {
   public static void main(String [] args) {
      
      //Create scanner and prompt user to enter
      //x1 and y1
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1 and y1: ");
      
      //Acquire point one and prompt user for point 2
      double pointX1 = input.nextDouble();
      double pointY1 = input.nextDouble();
      System.out.print("Enter x2 and y2: ");
      
      //Acquire point two and calculate distance
      double pointX2 = input.nextDouble();
      double pointY2 = input.nextDouble();
      double distance = Math.pow((Math.pow((pointX2 - pointX1), 2) + Math.pow((pointY2 - pointY1), 2) ), .5);
      
      //Display results
      System.out.println("The distance between the two point is " + distance);
   }
}