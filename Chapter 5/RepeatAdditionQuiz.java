/*Write a program that prompts the user 
to enter an answer for a question on 
addition of two single digit. Using a loop, 
you can let the user repeatedly enter a 
new answer until it is correct.*/

import java.util.Scanner; 

public class RepeatAdditionQuiz {
   public static void main(String [] args) {
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      
      //Create a scanner
      Scanner input = new Scanner(System.in);
      
      System.out.print(
         "What is " + number1 + " + " + number2 + "?");
      int answer = input.nextInt();
      
      while (number1 + number2 != answer) {
         System.out.print("Wrong answer. Try again. What is "
            + number1 + " + " + number2 + "?");
            answer = input.nextInt();
      }
      System.out.print("You got it!");
   }
}