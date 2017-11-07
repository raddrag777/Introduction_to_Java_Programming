/*Write a program that prompts the user to enter the 
first 9 digits and dispalys the 10-digit ISBN (including 
the leading zeroes). Your program should read the 

input as an integer.*/

import java.util.Scanner;

public class Exercise309 {
   
   public static void main(String [] args) {
      
      //Create scanner and prompt user for ISBN
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      
      //Acquire int 
      int digitInput = input.nextInt();
      
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
      
      /*Reassemble ISBN by multiplying by ten and adding next int
      This does not preserve leading zeroes must print as a string
      and not as an int
      
      int finalISBN = digitInput * 10;
      finalISBN = (finalISBN + digit2) * 10;
      finalISBN = (finalISBN + digit3) * 10;
      finalISBN = (finalISBN + digit4) * 10;
      finalISBN = (finalISBN + digit5) * 10;
      finalISBN = (finalISBN + digit6) * 10;
      finalISBN = (finalISBN + digit7) * 10;
      finalISBN = (finalISBN + digit8) * 10;
      finalISBN = (finalISBN + digit9);
      */
      
      //If checksum = 10, add X as last digit. Otherwise add
      //checksum as the last digit
      System.out.print("The ISBN number is " + digitInput + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9);
      if (checksum == 10)
         System.out.print("X");
      else
         System.out.print(checksum);
      
      //System.out.println(finalISBN);
      //System.out.println(checksum);
   }
}
