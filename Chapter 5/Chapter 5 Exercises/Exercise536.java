/*Use loops to simplify 3.9.*/

import java.util.Scanner;

public class Exercise536 {
   
   public static void main(String [] args) {
      
      //Create scanner and prompt user for ISBN
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      
      //Acquire int 
      String userInput = input.nextLine();
      int digitInput = Integer.parseInt(userInput);
      int digitX = 1;
      int checksum = 0;
      int number = 9;
      
      while (digitInput > 0) {
                     
         digitX = digitInput % 10;
         digitInput = digitInput / 10;
         checksum = checksum + (digitX * number);
         number--;
      }
      
      checksum = checksum % 11;

      //If checksum = 10, add X as last digit. Otherwise add
      //checksum as the last digit
      System.out.print("The ISBN-10 number is " + userInput);
      if (checksum == 10)
         System.out.print("X");
      else
         System.out.print(checksum);
     
   }
}
