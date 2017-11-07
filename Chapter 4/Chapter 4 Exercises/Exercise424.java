/*Write a program that prompts the user to 
enter three cities and displays them in 
ascending order.*/

import java.util.Scanner;

public class Exercise424 {
   public static void main(String [] args) {
   
   //Create scanner, prompt user for and acquire three cities
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the first city: ");
   String s1 = input.nextLine();
   System.out.print("Enter the second city: ");
   String s2 = input.nextLine();
   System.out.print("Enter the third city: ");
   String s3 = input.nextLine();
   
   //use nested if/else statements and compareTo to compare strings
   //and alphabetize and display results
   //s1 must be less than s2 AND s3 to be number 1
   if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0) { //if true, s1 is first
      System.out.print(s1);
      if (s2.compareTo(s3) < 0)//if true, s2 is second
         System.out.print(" " + s2 + " " + s3);
      else
         System.out.print(" " + s3 + " " + s2);         
   }
   
   else if (s2.compareTo(s3) < 0) { //if true, s2 is first         
      System.out.print(s2);
      if (s1.compareTo(s3) < 0)//if true, s1 is second
         System.out.print(" " + s1 + " " + s3);
      else
         System.out.print(" " + s3 + " " + s1); 
      }
   
   else {
      System.out.print(s3);//s3 must be first
      if (s1.compareTo(s2) < 0)//if true, s1 is second
         System.out.print(" " + s1 + " " + s2);
      else
         System.out.print(" " + s2 + " " + s1);
   }  
   }
}