//Write a program that calculates the energy needed 
//to heat water from an initial temperature to a 
//final temperature.

import java.util.Scanner;

public class Exercise210 {
   public static void main(String [] args) {
      
      //Create a scanner that prompts the user to enter
      //the amount of water in kg and receive that amount
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of water in kilograms: ");
      double waterAmount = input.nextDouble();
      
      //prompt user to enter initial temp and receive the amount
      System.out.print("Enter the initial temperature: ");
      double initialTemperature = input.nextDouble();
      
      //Prompt user to enter final temp and receive the amount
      System.out.print("Enter the final temperature: ");
      double finalTemperature = input.nextDouble();
      
      //Calculate energy needed and display results
      double energy = waterAmount * (finalTemperature - initialTemperature) * 4184;
      System.out.println("The energy needed is " + energy);
     
   }
}