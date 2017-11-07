/*Write a program that prompts the user 
to enter a decimal integer and displays 
its correspinding octal value. Don't use 
Java's Integer.toOctalString(int) in 
this program.*/

import java.util.Scanner;

public class Exercise538 {
   public static void main(String [] args) {
      
      //Create scanner, request and acquire decimal
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal integer: ");
      int decimalNumber = input.nextInt();
      
      String octalNumber = ""; 
      System.out.print("The decimal number " + decimalNumber);
      //Convert decimal to octal and display
      while (decimalNumber != 0) {
         octalNumber = decimalNumber % 8 + octalNumber;
         decimalNumber = decimalNumber / 8;
      }
      System.out.print(" in octal is: " + octalNumber);
   }
}