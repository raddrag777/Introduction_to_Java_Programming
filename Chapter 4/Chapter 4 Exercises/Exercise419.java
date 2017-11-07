/*Rewrite Exercise 3-19 by entering 
the ISBN number as a string.*/

import java.util.Scanner;

public class Exercise419 {
   
   public static void main(String [] args) {
      
      //Create scanner and prompt user for ISBN
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      
      //Acquire String 
      String s = input.nextLine();
      int digitInput = Integer.parseInt(s);
      
      //Separate the nine digits using division and modulo 
      int digit9 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit8 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit7 = digitInput % 10;
      digitInput = digitInput / 10; 
      
      int digit6 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit5 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit4 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit3 = digitInput % 10;
      digitInput = digitInput / 10;
      
      int digit2 = digitInput % 10;
      digitInput = digitInput / 10;

                  
      //digitInput is  now equal to the first digit
      //Calculate checksum
      int checksum = (digitInput * 1 + digit2 * 2 + digit3 * 3 
         + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 
         + digit8 * 8 + digit9 * 9) % 11;
      
            
      //If checksum = 10, add X as last digit. Otherwise add
      //checksum as the last digit
      System.out.print("The ISBN number is " + digitInput + digit2 + 
            digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9);
      if (checksum == 10)
         System.out.print("X");
      else
         System.out.print(checksum);
      
      //System.out.println(finalISBN);
      //System.out.println(checksum);
   }
}
