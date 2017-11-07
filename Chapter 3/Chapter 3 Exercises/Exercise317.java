/*Write a program that plays the popular 
scissor-rock-paper game. The program randomly 
generates a number 0,1, or 2 and prompts the 
user to enter a number and displays a message 
whether the user or the cojputer wins, loses, or draws.*/

import java.util.Scanner;

public class Exercise317 {

   public static void main(String [] args) {
   
//Create scanner and request 0, 1 or 2 from user
   Scanner input = new Scanner(System.in);
   System.out.print("scissor (0), rock (1), paper (2): ");
   
//Acquire user number and generate random 0,1, or 2
   int userGuess = input.nextInt();
   int userName = userGuess;
   
   int computerGuess = (int)(Math.random()* 3);
   int computerName = computerGuess;
   

//Use switches to assign string value for int value
   System.out.print("The computer is ");
   switch (computerName){
      case 0: System.out.print("scissors"); break;
      case 1: System.out.print("rock"); break;
      case 2: System.out.print("paper");
   }
   
   System.out.print(". You are ");
 
   switch (userName){
      case 0: System.out.print("scissors"); break;
      case 1: System.out.print("rock"); break;
      case 2: System.out.print("paper");
   }
   System.out.print(".");
   
//Compare computerGuess with userGuess and determine result
   if (userGuess == computerGuess)
      System.out.print(" It is a draw."); 
   
   else if (computerGuess == 0 && userGuess == 1 
         || computerGuess == 1 && userGuess == 2
         || computerGuess == 2 && userGuess == 0)
         
      System.out.print(" You Win!");
      
   else
      System.out.print(" Computer wins.");
   }  
}