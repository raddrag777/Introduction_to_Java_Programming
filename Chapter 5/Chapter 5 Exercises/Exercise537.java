/*Write a program that prmpts the user 
to enter a decimal integer and displays 
its corresponding binary value. Don't 
use Java's Integer.toVinaryString(int) 
in this program.*/

import java.util.Scanner;

public class Exercise537 {
   public static void main(String [] args) {
      
      //Create scanner, prompt user for, and 
      //acquire integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int decimalNumber = input.nextInt();
      
      //Convert decimal to binary
      //Initialze an empty string
      String binaryNumber = "";
      
      while (decimalNumber != 0) {//repeats till decimal is 0
         
         binaryNumber = decimalNumber % 2 + binaryNumber;
         decimalNumber = decimalNumber / 2;
         
      }
      System.out.println("The decimal number " + decimalNumber +
         " in binary is: " + binaryNumber); 
   }
}
/*What happens inside of while loop 
   decimal    binary   decimal end
   at start   output   at end 
   of each             of each
   iteration           iteration
   13          1         6
   6           01        3
   3           101       1
1           1101      0
*/