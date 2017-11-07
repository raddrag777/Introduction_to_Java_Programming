/*Write a program that prompts the user 
to enter a letter grade A, B, C, D, or F 
and displays its corresponding numeric 
value 4, 3, 2, 1 or 0.*/

import java.util.Scanner;

public class Exercise414 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for letter
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: "); 
      
      //Acquire letter grade as string and convert to 
      //a character
      
      String s = input.nextLine();
      char ch = s.charAt(0);
           
      //Eliminate invalid input
      if (ch == 'A' || ch == 'B' || ch == 'C' || 
            ch == 'D' || ch == 'F'){
         //Print number value
         System.out.print("The numberic value for grade " + 
            ch + " is ");
         switch (ch){
            case 'A': System.out.print("4"); break;
            case 'B': System.out.print("3"); break;
            case 'C': System.out.print("2"); break;
            case 'D': System.out.print("1"); break;
            case 'F': System.out.print("0"); 
         }
      }  
      else
         System.out.print(ch + " is an invalid grade");
   }
}