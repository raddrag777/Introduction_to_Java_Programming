/*Write a program that prompts the user to 
enter a string and displays the characters 
at odd positions.*/

import java.util.Scanner;

public class Exercise548 {
   
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      int sLength = s.length();
      int endOfString = sLength;
      int x = 0;
            
      while (sLength > 0) {
         
         if (x < endOfString) {
            System.out.print(s.charAt(x));
         }
         x = x + 2;
         sLength--; 
        // System.out.println(sLength);
      }
   }
}