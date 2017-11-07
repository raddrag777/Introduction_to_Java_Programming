/*Write a program that prompts the user 
to enter the distance to drive, the fuel 
efficiency of the carin miles per gallon, 
and the price per gallon, and displays 
the cost of the trip.*/

import java.util.Scanner;

public class Exercise223 {
   public static void main(String [] args) {
      
      
      //Create a scanner and prompt user for driving distance
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the driving distance: ");
      
      //Acquire the distance and prompt user for miles per gallon
      double drivingDistance = input.nextDouble();
      System.out.print("Enter miles per gallon: ");
      
      //Acquire miles per gallon and prompt user for price per gallon
      double milesPerGallon = input.nextDouble();
      System.out.print("Enter price per gallon: ");
      
      //Acquire price per gallon and calculate cost of driving
      double pricePerGallon = input.nextDouble();
      
      double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;
      
      //Display results
      System.out.println("The cost of driving is $" + (int)(costOfDriving * 100) / 100.0); 
   }
}