/*Write a program  to have the user 
input 12 digits of an ISBN-13 number 
and calculate the checksum for the 
thirteenth digit.*/

import java.util.Scanner;

public class Exercise547 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
      String sNumber = input.next();
      
      int sLength = sNumber.length();//Get string length
      //Declare and initialize variables
      double sum = 0;
      double checksum = 0; 
      int digit = 0;
      
      if (sLength == 12) {
         while (sLength > 0) {//calculate checksum sum
         
            digit = sNumber.charAt(sLength-1) - '0';//see note
            if (sLength % 2 == 0){//evens are multiplied by 3
               sum = sum + digit * 3;
            }
            else {
               sum = sum + digit;
            }
            sLength--;
         }
         
         checksum = 10 - sum % 10;
         
         if (checksum == 10){
            System.out.print("The ISBN-13 number is " + sNumber + "0");
         }
         else {
            System.out.print("The ISBN-13 number is " + sNumber + checksum);
         }
      }
      else {
         System.out.print(sNumber + " is an invalid input.");
      }
   }
}
/*
 The values of '0', '1', '2', ... in ascii 
 are ascending.  So '0' in ascii is 48, 
 '1' is 49, etc. So if you  take '2' - '0' 
 you really just get 50 - 48 = 2. 
 Look at an ASCII table.
 */

