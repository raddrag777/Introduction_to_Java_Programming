/*Write a program that prompts the user to 
enter two characters and displays the major 
and status represetned in the characters. 
The first character indicates the major and 
the second is number charcter 1, 2, 3, , 4, 
which indicates whether a student is a 
freshman, sophomore, junior, or senior.*/

import java.util.Scanner;

public class Exercise418 {
   public static void main(String [] args) {
      
      //Create a scanner and then prompt user for two characters
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two characters: "); 
      
      //Acquire characters as string and then extract
      //each character
      String s = input.next();
      String ch1 = s.substring(0, 1);
      String ch2 = s.substring(1);
      
      //display what characters represent
      if (ch1.equals("M") || ch1.equals("C") || ch1.equals("I")) {
      
         switch (ch1) {
            case "M": System.out.print("Mathematics"); break;
            case "C": System.out.print("Computer Science"); break;
            case "I": System.out.print("Information Technology"); 
            } 
      System.out.print(" ");
         switch (ch2) {
            case "1": System.out.print("Freshman"); break;
            case "2": System.out.print("Sophomore"); break;
            case "3": System.out.print("Junior"); break;
            case "4": System.out.print("Senior"); 
         }
      }
      else
         System.out.print("Invalid input");

   }
}