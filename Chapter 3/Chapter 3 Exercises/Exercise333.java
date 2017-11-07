/*Write a program to compare the cost of rice in
two different packages. Propt the user to enter 
the weight and prcie of eache hpackage and display 
the one with the better price.*/

import java.util.Scanner;

public class Exercise333 {
   
   public static void main(String [] args) {
   
//Create a scanner and prompt user for and acquire weight and price
//for two packages of rice
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight and price for package 1: ");
      double weight1 = input.nextDouble();
      double price1 = input.nextDouble();
      System.out.print("Enter weight and price for package 2: ");
      double weight2 = input.nextDouble();
      double price2 = input.nextDouble();
      
//Calculate price per weight for each package
      double pricePerPound1 = price1 / weight1;
      double pricePerPound2 = price2 / weight2;
      
//Compare two price per pounds and display results
      if (pricePerPound1 < pricePerPound2)
         System.out.println("Package 1 has the better price.");
      
      else if (pricePerPound1 == pricePerPound2)
         System.out.println("Two packages have the same price.");
      
      else
         System.out.println("Package 2 has the better price.");
   }
}