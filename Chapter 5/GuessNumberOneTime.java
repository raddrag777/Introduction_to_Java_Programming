/*Write a program that randomly generates an 
integer between 0 and 100, inclusive. 
The program prompts the user to enter a 
number continuouslyuntil the number matces 
the randomly generated number. For each input. 
the program tells the user whether the input 
is too low or too high, so the user can make 
the next guess intelligently.*/

import java.util.Scanner;

public class GuessNumberOneTime {
   public static void main(String [] args) {
      //Generate a random number to be guessed
      int number = (int)(Math.random() * 101);
      
      Scanner input = new Scanner(System.in);
      System.out.println("Guess a magic number between 0 and 100");
      
      int guess = -1;
      while (guess != number) {
      //Prompt the user to guess the number
      System.out.print("\nEnter your guess: ");
      guess = input.nextInt();
      
      if (guess == number)
         System.out.print("Yes, the number is " + number);
      else if (guess > number)
         System.out.print("Your guess is too high.");
      else
         System.out.print("Your guess it too low.");
      } //end of loop       
   }  
}