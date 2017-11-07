/*Write a program that receives an ASCII code 
and dispalys its character.*/

import java.util.Scanner;

public class Exercise408 {
   public static void main(String [] args) {
      
      //Create a scanner and request and acquire ASCII code
      Scanner input = new Scanner(System.in);
      System.out.print("Enter and ASCII code: ");
      int code = input.nextInt();
      
      //Convert integer to character
      System.out.print(" The character for ASCII code " 
         + code + " is " +(char)code);
   }
}