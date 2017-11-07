/*Write a program that prompts the user to 
enter a temperature and wind speed. The 
program displays the wind-chill temperature 
if the input is valid; otherwise, it displays 
a message indicating whther the temperature 
and/or the wind speed is invalid.*/

import java.util.Scanner;

public class Exercise320 {
   public static void main(String [] args) { 
      
//Create a scanner and request and then acquire temp and wind speed
   Scanner input = new Scanner(System.in);
   System.out.print("Enter temperature: ");
   double temperature = input.nextDouble();
   System.out.print("Enter wind speed: "); 
   double windSpeed = input.nextDouble();
   int x = 0;
   
   double windChill = (35.74 + (0.6215 * temperature) - 
          (35.75 * Math.pow(windSpeed, 0.16)) + 
          (0.4275 * temperature * Math.pow(windSpeed, 0.16)));
   
//Determine if temperature and windChill are within parameters
   if (temperature < -58){
      System.out.println("Temperature Not valid");
      x = x + 1;
   }   
   if (temperature > 41){
      System.out.println("Temperature Not valid");
      x = x + 1;
   }
   if (windSpeed < 2) {
      System.out.println("Wind Speed Not valid"); 
      x = x + 1;    
   }
   if (x < 1) 
       System.out.print("Windchill = " + windChill);
        
   }
}