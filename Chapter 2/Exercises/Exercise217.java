/*Write a program that prompts the user to 
enter a temperature and a wind speed and 
displays the windchill temperature*/

import java.util.Scanner;

public class Exercise217 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for temp
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit between -58 and 41 degrees: ");
      
      //Acquire temp and prompt user for wind speed
      double temperature = input.nextDouble();
      System.out.print("Enter the wind speed (>=2) in miles per hour: ");
      
      //Acquire wind speed and calculate wind chill
      double windSpeed = input.nextDouble();
      double windChill = 35.74 + (0.6215 * temperature) - 
         (35.75 * Math.pow(windSpeed, 0.16)) + 
         (0.4275 * temperature * Math.pow(windSpeed, 0.16));
      
      //Display results
      System.out.println("The windchill index is " + windChill);
   }
}