/*Write a program that prompts the user 
to enter a string and displays the number 
of uppercase letters in the string.*/

import java.util.Scanner;

public class Exercise550 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      int sLength = s.length();
      
      char ch;
      int x = 0;
      int upperCase= 0;
      
      while (sLength > 0) {
         
         if (Character.isLetter(s.charAt(x))){
               
            if (Character.isUpperCase(s.charAt(x))) {
               upperCase++;
            } 
               
         } 
         
         x++;
         sLength--;
         
      }
      System.out.print("The number of uppercase letter is " +upperCase);
   }
}