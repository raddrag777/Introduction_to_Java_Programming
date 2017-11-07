/*Write a program that prompts the user 
to enter a Social Security number in the 
format DDD-DD-DDDD, where D is a digit. 
Your program should check whether the 
input is valid.*/

import java.util.Scanner;

public class Exercise421 {
   public static void main(String [] args) {
      
      
      //Create a scanner and prompt user for social security number
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a SSN: "); 
      String s = input.nextLine();
      int sLength = s.length();
      
      //Determine if the proper length string is inputted and 
      //display results
      if (sLength == 11)
         System.out.print(s + " is a valid SSN.");
      else
         System.out.print(s + " is not a valid SSN.");
   }
}