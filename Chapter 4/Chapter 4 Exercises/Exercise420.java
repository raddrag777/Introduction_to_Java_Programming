/* Write a program that prompts the user to enter 
a string and display its length and its first character*/

import java.util.Scanner;

public class Exercise420 {
   public static void main(String [] args) {
   
   //Create a scanner and prompt user for a string
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a string of characters: ");
   
   //Acquire string and get lenth and first character
   String s = input.next();
   System.out.println("String length is: " + s.length());
   System.out.println("First character is: " + s.charAt(0));
   }
}
