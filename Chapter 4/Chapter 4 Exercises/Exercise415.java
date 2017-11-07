/*Write a program that prompts the user to enter 
a letter and displays its corresponding number*/

import java.util.Scanner;

public class Exercise415 {
   public static void main(String [] args) {
   
   //Create a scanner and prompt user for number
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a letter: "); 
   
   //Acquire number as string and convert to character
   String s = input.nextLine();
   char ch = s.charAt(0);
   
   //Identify and display number
   if (ch == 'a' || ch == 'b' || ch == 'c' ||
         ch == 'A' || ch == 'B' || ch == 'C')
      System.out.print("The corresponding number is 2");
   else if (ch == 'd' || ch == 'e' || ch == 'f' ||
         ch == 'D' || ch == 'E' || ch == 'F')
      System.out.print("The corresponding number is 3");
   else if (ch == 'g' || ch == 'h' || ch == 'i' ||
         ch == 'G' || ch == 'H' || ch == 'I')
      System.out.print("The corresponding number is 4"); 
   else if (ch == 'j' || ch == 'k' || ch == 'l' ||
         ch == 'J' || ch == 'K' || ch == 'L')
      System.out.print("The corresponding number is 5");
   else if (ch == 'm' || ch == 'n' || ch == 'o' ||
         ch == 'M' || ch == 'N' || ch == 'o')
      System.out.print("The corresponding number O 6");
   else if (ch == 'p' || ch == 'q' || ch == 'r' || ch =='s' ||
         ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S')
      System.out.print("The corresponding number is 7");
   else if (ch == 't' || ch == 'u' || ch == 'v' ||
         ch == 'T' || ch == 'U' || ch == 'V')
      System.out.print("The corresponding number is 8");
   else if (ch == 'w' || ch == 'x' || ch == 'y' || ch =='z' ||
         ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z')
      System.out.print("The corresponding number is 9");
   else
      System.out.print(ch + " is an invalid input");
   }
}