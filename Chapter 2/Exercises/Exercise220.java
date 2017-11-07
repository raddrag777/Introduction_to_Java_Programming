/*Write a program that reads the balance and the 
annual percentage interest rate and displays the 
interest for the next month*/

import java.util.Scanner;

public class Exercise220 {
   public static void main(String [] args) {
      
      
      //Create a Scanner and request balance and interest rate from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
      
      //Acquire balance and interest rate
      double balance = input.nextDouble();
      double interestRate = input.nextDouble();
      
      //Calculate interest
      double interest = balance * (interestRate / 1200);
      
      //Display results
      System.out.println("The interest is "+ interest);  
   }
}