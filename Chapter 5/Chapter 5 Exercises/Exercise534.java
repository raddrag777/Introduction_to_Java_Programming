/*Revise rock scissor paper game to let 
the user continuously play until either 
the user or the computer wins more than 
two times that its opponent.*/

import java.util.Scanner;

public class Exercise534 {

   public static void main(String [] args) {
   
   int userScore = 0;
   int computerScore = 0;
   
   while (userScore < computerScore + 2 && 
      computerScore < userScore + 2){
   
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
         System.out.println(" It is a draw."); 
      
      else if (computerGuess == 0 && userGuess == 1 
            || computerGuess == 1 && userGuess == 2
            || computerGuess == 2 && userGuess == 0) {
         
         userScore++;   
         System.out.println(" You Win! " + userScore + "-" + computerScore);
         
      }
         
      else {
         computerScore++;
         System.out.println(" Computer wins. " + computerScore + "-" + userScore);
      }
      
   }
   
   if (computerScore > userScore){
      System.out.println("Computer wins the match!");
   }  
   else{
      System.out.println("You win the match!");
   }
   }  
}