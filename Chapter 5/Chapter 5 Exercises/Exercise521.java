/*Write a program that lets the user 
enter the loan amount and loan period 
in number of years and displays the 
montly and total pauments for each 
interest rate starting from 5 to 8%, 
with an increment of 1/8. */

import java.util.Scanner;

public class Exercise521 {
   public static void main(String [] args) {
      
      //Create a scanner, request and acquire loan 
      //amount and loan period
      Scanner input = new Scanner(System.in);
      System.out.print("Loan amount: ");
      double loanAmount = input.nextDouble();
      System.out.print("Number of Years: ");
      int years = input.nextInt();
      
      //Declare variables
      double interestRate = 5.0;
      double monthlyPayment = 0;
      double totalPayment = 0;
      
      System.out.printf(
         "Interest Rate%20s%18s\n\n", "Monthly Payment", "Total Payment");
      
      //Use loop to calculate payments and display results
      while (interestRate <= 8.0){
         double r = interestRate / 1200;//monthly interest rate
         double n = years * 12;//number of months
         monthlyPayment = loanAmount * ((r * (Math.pow(1 + r, n))) / (Math.pow(1 + r, n) - 1));
         totalPayment = monthlyPayment * n;
         System.out.printf(
            "%1.3f%%%18.2f%22.2f\n", interestRate, monthlyPayment, totalPayment);
         interestRate= interestRate + 0.125;
      }  
   }
}
//Monthly payment = P [{r(1+r)^n}/{(1+r)^n-1}]