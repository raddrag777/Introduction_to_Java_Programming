/*Write a program that lets the user guess whether 
the flip of a coin results in heads or tails. The 
program randomly generates an integer 0 or 1, which 
representshead or tail. The program prompts the user 
to enter a guess and reports wehter the guess is 
correct or incorrect*/

import java.util.Scanner;

public class Exercise314 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for heads or tails
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 0 for heads or 1 for tails: ");
      
      //Acquire input from user
      int guess = input.nextInt();
      
      //Generate random 0 or 1
      double randomNumber = 2 * Math.random();
      int headOrTails = (int)randomNumber;
      
      //Compare guess to randomNumber
      if (guess == headOrTails)
         System.out.println("Correct!");
      else
         System.out.println("Incorrect.");
            
        }
}