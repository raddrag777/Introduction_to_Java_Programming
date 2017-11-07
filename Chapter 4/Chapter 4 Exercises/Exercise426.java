/*Rewrite Listing 2.10, ComputeChange.java, 
to fix the possible loss of accuracy when 
converting a float value to an int value. 
Read the input as a string such as"11.56". 
Your program should extract the dollar amount 
before the decimal point and the cents after 
the decimal amount using the indexOf 
and substring methods.*/

import java.util.Scanner;

public class Exercise426 {
   public static void main(String [] args) {
      //Create a Scanner
      Scanner input = new Scanner(System.in);
      
      //Receive the amount
      System.out.print("Enter an amount in double, for example 11.56: ");
      String amount = input.nextLine();
      
      //Extract the number of one dollarsby using substring
      //extract from 0 to decimal using indexOf
      String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));
      
      //Extract cents- usesubstring/indexOf from decimal, adding 1 to the
      //index so that you start the string one digit from decimal.
      //Use Integer.parseInt to convert string to int
      int cents = Integer.parseInt(amount.substring(amount.indexOf('.')+ 1));
      
      //find the number of quarters
      int numberOfQuarters = cents / 25;
      
      //use modulo to remove quarters from cents
      cents %= 25;
      
      //Find the number of dimes
      int numberOfDimes = cents / 10;
      
      //Use Modulo to remove dimes from cents
      cents %= 10;
      
      //Find the number of nickels
      int numberOfNickels = cents / 5;
      
      //Use modulo to remove nickels from cents
      
      cents %= 5;
       int numberOfPennies = cents;
      
      //Display results
      System.out.println("Your amount " + amount + " consists of ");
      System.out.println("    " + numberOfOneDollars + " dollars");
      System.out.println("    " + numberOfQuarters + " quarters");
      System.out.println("    " + numberOfDimes + " dimes");
      System.out.println("    " + numberOfNickels + " nickels");
      System.out.println("    " + numberOfPennies + " pennies");
   }
}