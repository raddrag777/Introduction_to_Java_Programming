/*Write a program that prompts the user to enter a letter 
and check whther the letter is a vowel or consonant.*/

import java.util.Scanner;

public class Exercise413 {
   public static void main(String [] args) {
      
      //Create scanner and prompt user for letter
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
            
      //Acquire letter and convert string to character
      String s = input.nextLine();
      char ch = s.charAt(0);
      
      if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
         if (ch == 'a' || ch ==  'e' || ch == 'i' || ch == 'o' ||
               ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || 
               ch == 'O' || ch == 'U')
            System.out.print(ch + " is a vowel ");
         else
            System.out.print(ch + " is a consonant");
      }
      else
         System.out.print(ch + " is an invalid input");
   }
}