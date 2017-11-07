/*Write a program that prompts the 
user to enter two strings and reports 
whether the second string is a substring 
of the first string.*/

import java.util.Scanner;

public class Exercise422 {
   public static void main(String [] args) {
      //Create a scanner and prompt user for and input two strings
      Scanner input = new Scanner(System.in);
      System.out.print("Enter string s1: ");
      String s1 = input.nextLine();
      System.out.print("Enter string s2: ");
      String s2 = input.nextLine();
      
      //Check if s2 is substring of s1
      if (s1.contains(s2)) 
         System.out.print(s2 + " is a substring of " + s1);
      else
         System.out.print(s2 + " is not a substring of " + s1);
   }
}