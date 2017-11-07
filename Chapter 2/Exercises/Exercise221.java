/*Write a program that reads in investment amount, 
annual interest rate, and number of years, and 
displays the future investment value*/

import java.util.Scanner;

public class Exercise221 {
   public static void main(String [] args) {
      
      
      //Create scanner and request investment amount
      Scanner input = new Scanner(System.in);
      System.out.print("Enter investment amount: ");
      
      //Acquire investment amount and request annual interest
      double investmentAmount = input.nextDouble();
      System.out.print("Enter annual interest rate: ");
      
      //Acquire annaul interest rate and request number of years
      double annualInterestRate = input.nextDouble();
      System.out.print("Enter number of years: ");
      
      //Acquire number of years and calculated accumulated value
      double numberOfYears = input.nextDouble();
      double monthlyInterestRate = annualInterestRate / 1200;
      double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)));
      
      //Display results
      System.out.println("Accumulated value is " + (int)(futureInvestmentValue * 100 )/ 100.0);
   }
}