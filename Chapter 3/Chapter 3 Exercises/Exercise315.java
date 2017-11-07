/*Revise Lottery.java to generate a lottery 
of a three-digit number. The program prompts 
the user to enter a three-digit number and 
determines whether the user wins.*/

import java.util.Scanner;

public class Exercise315 {
   public static void main(String [] args) {
   
      double randomHundreds = 0;
      
      //Create a scanner and prompt user for thee-digit number
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a three-digit number:");
      
      //Acquire user number
      int lotteryGuess = input.nextInt();
      
      //Separate each digit
      int digit3 = lotteryGuess % 10;
      int remainingAmount = lotteryGuess / 10;
      int digit2 = remainingAmount % 10;
      remainingAmount = remainingAmount / 10;
      int digit1 = remainingAmount;
      
      //Acquire a random 3-digit number
      double randomLotteryNumber = Math.random() * 1000;
      int randomLotteryInt = (int)randomLotteryNumber;
      
      //If randomLotteryInt < 100, add random hundreds
      if (randomLotteryInt < 100)
         randomHundreds = Math.random() * 1000; 
         randomLotteryInt = (int)randomHundreds + randomLotteryInt;
      
      //Separate each digit
      int randomDigit3 = randomLotteryInt % 10;
      int remainingLotteryAmount = randomLotteryInt / 10;
      int randomDigit2 = remainingLotteryAmount % 10;
      remainingLotteryAmount = remainingLotteryAmount / 10;
      int randomDigit1 = remainingLotteryAmount;
      
     
      
      //Determine if winner and what prize
      if (lotteryGuess == randomLotteryInt)
         System.out.println("Exact match: you win $10,000!");
         
      else if (digit1 == randomDigit2 && digit2 == randomDigit3 && digit3 == randomDigit1 
            || digit2 == randomDigit1 && digit3 == randomDigit2 && digit1 == randomDigit3)
         System.out.println("Match all digits: you win $3000!");
      
      else if (digit1 == randomDigit1 ||
            digit1 == randomDigit2 || 
            digit1 == randomDigit3 ||
            digit2 == randomDigit1 ||
            digit2 == randomDigit2 ||
            digit2 == randomDigit3 ||
            digit3 == randomDigit1 ||
            digit3 == randomDigit2 ||
            digit3 == randomDigit3)
         System.out.println("Match one digit: you win $1000!");
            
       else
         System.out.println("Sorry, no match."); 
            
      
      System.out.println(randomLotteryInt);
      /*System.out.println(digit1);
      System.out.println(digit2);
      System.out.println(digit3);*/ 
   }
}