/*Write a program that prompts the user to enter 
the exchange rate from currency in U.S.dollars 
to Chinese RMB. Prompt the user to enter 0 to 
convert from U.S. dollars to Chinese RMB and 
1 to convert from Chinese RMB to U.S. dollars. */

import java.util.Scanner;

public class Exercise331 {
   
   public static void main(String [] args) {

//Create a scanner, prompt user for and acquire 0 or 1 and amount
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the the exchange rate from dollars to RMB: ");
      double exchangeRate = input.nextDouble();
      
      System.out.print("Enter 0 to convert dollars to RMB adn 1 vice versa: ");
      int exchangeType = input.nextInt();
      
      if (exchangeType == 0){
         System.out.print("Enter the dollar amount: ");
         double amountDollars = input.nextDouble();
//Convert dollars to RMB
         double exchangedRMB = exchangeRate * amountDollars;
         System.out.println("$" + amountDollars + " is " + (int)(100 * exchangedRMB) /100.0 + " yuan.");
      }
      
      else if (exchangeType == 1) {
         System.out.print("Enter the RMB amount: ");
         double amountRMB = input.nextDouble();
         double exchangedDollars = amountRMB / exchangeRate;
         System.out.println(amountRMB + " yuan is $" + (int)(100 * exchangedDollars) / 100.0 + ".");
      }
      
      else {
         System.out.println("Incorrect input.");
      }
   }
}