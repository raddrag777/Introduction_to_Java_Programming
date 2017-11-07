/*Revise Lottery.java to generate a 
lottery of a two-digit number. The 
two digits in the number are distincet. 
(Hint: Generate the first digit. Use a 
loop to continuously generate the 
second digit until it is different 
from the first digit.)*/

import java.util.Scanner;

public class Exercise532 {
   public static void main(String [] args) {
      //Generate a lottery number
      //int lottery = (int) (Math.random() * 100);
     int lottery = 22; 
      //Prompt user to enter a guess
      Scanner input = new Scanner(System.in);
      System.out.print(
         "Enter your lottery pick (two different digits): ");
      int guess = input.nextInt();
      
      //Get digits from guess
      int guessDigit1 = guess / 10;
      int guessDigit2 = guess % 10; 
      
      //Get digits from lottery
      int lotteryDigit1 = lottery / 10;
      int lotteryDigit2 = lottery % 10;
      
      while (lotteryDigit1 == lotteryDigit2) {
         lotteryDigit2 = (int)(Math.random() * 10);
      }
      
      System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);
      
      //Check the guess 
      if (guessDigit1 ==lotteryDigit1 && guessDigit2 == lotteryDigit2)
         System.out.println("Exact match: you win $10.000");
        
      else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
         System.out.println("Match all digits: You win $3000");
     
      else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
         System.out.println("Match one digit: you win $ 1,000");
      
      else 
         System.out.println("Sorry, no match");

      
      
   }
}