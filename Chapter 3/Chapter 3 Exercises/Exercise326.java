/*Write a program that prompts the user to
enter an integer and determines 
whether it is divisible by 5 and 6, 
whether it is diviisble by 5 or 6, and 
whether it is divisible by 5 or  , but not both.*/

import java.util.Scanner;

public class Exercise326 {
   
   public static void main(String [] args) {

//Create Scanner and prompt user for and acquire an integer

      Scanner input =  new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int userNumber = input.nextInt();
      
//Determine if userNumber 
      System.out.print("Is " + userNumber + " divisible by 5 and 6? "); 
      System.out.println(userNumber % 5 == 0 && userNumber % 6 == 0);
      System.out.print("Is " + userNumber + " divisible by 5 or 6? ");
      System.out.println(userNumber % 5 == 0 || userNumber % 6 == 0);
      System.out.print("Is " + userNumber + " divisible by 5 or 6, but not both? ");
      System.out.println(userNumber % 5 == 0 ^ userNumber % 6 == 0);
   }
}