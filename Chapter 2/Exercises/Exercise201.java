//Write a program that reads a Celsius degree in a double value from the console, then 
//converts it to Fahrenheit and displays the result.f

import java.util.Scanner;

public class Exercise201 {
   public static void main(String[] args) {
      
      //Create a scanner and request in integer in celsius
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an interger for Celsius degrees: ");
      
      //Receive the integer for Celsius and convert it to fahrenheit
      int degreesCelsius = input.nextInt();
      double degreesFahrenheit = ((9.0 / 5 * degreesCelsius) + 32);
      
      //Display results
      System.out.println(degreesCelsius + " degrees Celsius is " + degreesFahrenheit + " degrees Fahrenheit."); 
   }
}