/*Write a program that prompts the user 
to enter a three-digitinteger and determines 
whether it is a palindrome number. */

import java.util.Scanner;

public class Exercise312 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for and acquire three-digit number
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a three-digit integer: ");
      int threeDigitNumber = input.nextInt();
      
      //Separate out each digit
      int digit3 = threeDigitNumber % 10;
      int remainingAmount = threeDigitNumber / 10;
      int digit2 = remainingAmount % 10;
      int digit1 = remainingAmount / 10;
      
      //Swap values of digit1 and digit3
      int tempValue = digit1;
      digit1 = digit3;
      digit3 = tempValue;
      
      //Regain a new three-digit number
      int new3Digit = ((digit1 * 10 + digit2) * 10 + digit3);
      
      //Determine if palindrome by comparing threeDigitNumber to 
      
      if (new3Digit == threeDigitNumber)
         System.out.print(threeDigitNumber + " is a palindrome.");
      
      else 
         System.out.print(threeDigitNumber + " is not a palindrome.");
     
   }
}