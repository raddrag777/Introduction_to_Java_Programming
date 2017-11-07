/*Write a program that prompts the user to 
enter a short integer and displays the 16 
bits for the integer.*/

import java.util.Scanner;

public class Exercise544 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      short number = input.nextShort();
      
      String binaryBits = "";
      int bitNumber = 0;
      while (bitNumber < 16) {
         System.out.println(number + " " + binaryBits);
         binaryBits = (number & 1) + binaryBits;//& divides by 2
         number >>= 1;
         bitNumber++;
      }
      System.out.println(binaryBits);
      
   }
}

/*
 &   --integer divides your number by 2
 >>= --placing the equals sign after the right shift forms a bitwise
       assignment operator(appendix G) this right shifts the value of 
       a variable by the number of bits specified in the value of an 
       expression (by 1 in our case), maintains the sign, and assigns 
       the result to the variable. 
  Enter an integer: 2573
 2573 
 1286 1
 643 01
 321 101
 160 1101
 80 01101
 40 001101
 20 0001101
 10 00001101
 5 000001101
 2 1000001101
 1 01000001101
 0 101000001101
 0 0101000001101
 0 00101000001101
 0 000101000001101
 0000101000001101
 */