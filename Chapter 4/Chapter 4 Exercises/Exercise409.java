/*Write a program that receives a character 
and displays its Unicode.*/

import java.util.Scanner;

public class Exercise409 {
   public static void main(String [] args) {
   
   //Create a Scanner, request character
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a character: ");
   
   //Input character as a string
   String s = input.nextLine();
   
   //Extract character from string
   char ch = s.charAt(0);
   
   //Cast character as an integer and display
   System.out.println((int)ch);
	}
}