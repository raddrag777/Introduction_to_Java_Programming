//Rewrite programming Exercise 1.11 to prompt the user 
//to enter the number of years and display the population

import java.util.Scanner;

public class Exercise211 {
   public static void main(String [] args) {
      
      //Create a scanner and then prompt user for 
      //number of years
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of years: ");
      
      //Receive number of years and calculate population
      int years = input.nextInt();
      int population = 312032486 + ((((60 * 60 * 24 * 365) / 7) - ((60 * 60 * 24 * 365) / 13) 
         + ((60 * 60 * 24 * 365) / 45)) * years);
      
      System.out.print("The population in " + years + " is " + population);

      }
}

