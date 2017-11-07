/*Write a program that prompts the user to enter a
monthly saving amount and displays the account value
after the sixth month*/

import java.util.Scanner;

public class Exercise213 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for 
      //monthly saving amount
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the monthly saving amount: ");
      
      //Receive the amount and calculate interest
      double monthlyAmount = input.nextDouble();
      double newMonthlyAmount = monthlyAmount * (1 + 0.00417);
      newMonthlyAmount = (monthlyAmount + newMonthlyAmount) * (1 + 0.00417);
      newMonthlyAmount = (monthlyAmount + newMonthlyAmount) * (1 + 0.00417);
      newMonthlyAmount = (monthlyAmount + newMonthlyAmount) * (1 + 0.00417);
      newMonthlyAmount = (monthlyAmount + newMonthlyAmount) * (1 + 0.00417);
      newMonthlyAmount = (monthlyAmount + newMonthlyAmount) * (1 + 0.00417);
  
      //Display results
      System.out.println("After the sixth month, the account value is $" +(int) (newMonthlyAmount * 100) / 100.0);      
   }
}