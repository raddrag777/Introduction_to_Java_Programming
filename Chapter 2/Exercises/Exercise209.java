//Write a program that prompts the user to enter
//the starting velocity in meters/second, the ending
//velocity, and the time span t in seconds and 
//displays the average acceleration

import java.util.Scanner;

public class Exercise209 {
   public static void main(String [] args) {
      
      //Create a new scanner and then prompt user to
      //input starting, ending velocity and time
      Scanner input = new Scanner(System.in);
      System.out.print("Enter v0, v1, and t: ");
      
      //Receive initial, ending velocity, and time      
      double velocityInitial = input.nextDouble();
      double velocityEnd = input.nextDouble();
      double time = input.nextDouble();
      
      //Calculate acceleration
      double acceleration = (velocityEnd - velocityInitial) / time;
      
      //Display acceleration
      System.out.println("The average acceleration is " + acceleration);      
   }
}