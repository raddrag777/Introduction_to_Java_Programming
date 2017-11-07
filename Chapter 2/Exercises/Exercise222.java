/*Rewrite Listing 2.10, ComputeChange to fix the 
possible loss of accuracy when converting a 
double value to in int value*/

import java.util.Scanner;

public class Exercise222 {
   public static void main(String [] args) {
      //Create a Scanner
      Scanner input = new Scanner(System.in);
      
      //Receive the amount
      System.out.print("Enter an amount with no decimal: ");
      int remainingAmount = input.nextInt();
      
     // double remainingAmount = amount * 100;
      
      //Find the number of one dollars
      int numberOneDollars = remainingAmount / 100;
      remainingAmount = remainingAmount % 100;
      
      //Find the number of quarters in the remaining amount
      int numberOfQuarters = remainingAmount / 25;
      remainingAmount = remainingAmount % 25;
      
      //Find the number of dimes in the remaining amount
      int numberOfDimes = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;
      
      //Find the number of nickels in the remaining amount
      int numberOfNickels = remainingAmount / 5;
      remainingAmount = remainingAmount % 5;
      
      //Find the number of pennies
      int numberOfPennies = remainingAmount;
      
      //Display results
      System.out.println("Your amount " + remainingAmount + " consists of ");
      System.out.println("    " + numberOneDollars + " dollars");
      System.out.println("    " + numberOfQuarters + " quarters");
      System.out.println("    " + numberOfDimes + " dimes");
      System.out.println("    " + numberOfNickels + " nickels");
      System.out.println("    " + numberOfPennies + " pennies");
   }
}