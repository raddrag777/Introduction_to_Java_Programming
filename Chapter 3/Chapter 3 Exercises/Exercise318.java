/*Write a program that prompts the user to 
enter the weight of the package and display 
the shipping cost. If the weight is greater 
than 50, display a message "the package 
cannot be shipped."*/

import java.util.Scanner;
 
public class Exercise318 {
   
   public static void main(String [] args) {
      
//Create scanner and request user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight of the package: ");
      
//Acquire weight 
      double weight = input.nextDouble();
      
//Calculate shipping cost
      if (weight == 1 || weight < 1)
         System.out.print("Shipping cost is: $3.50");
      else if (weight < 3 || weight == 3)
         System.out.print("Shipping cost is: $5.50");
      else if (weight < 10 || weight == 10)
         System.out.print("Shipping cost is: $8.50");
      else if (weight < 50 || weight == 50)  
         System.out.print("Shipping cost is: $10.50 ");
      else
         System.out.print("The package cannot be shipped");
   }
}