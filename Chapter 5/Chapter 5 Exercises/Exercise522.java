/*Write a program that lets the user enter 
the loan amount, number of years, and interest
rate and displays the amortization schedule 
for the loan. */

import java.util.Scanner;

public class Exercise522 {
   public static void main(String [] args) {
      
      //Create a scanner, request and acquire loan 
      //amount and loan period
      Scanner input = new Scanner(System.in);
      System.out.print("Loan amount: ");
      double loanAmount = input.nextDouble();
      System.out.print("Number of Years: ");
      int years = input.nextInt();
      System.out.print("Annual Interest Rate: ");
      double annualRate = input.nextDouble();
      
      //Declare variables
      double interest = 0;
      double r = annualRate / 1200;//monthly interest rate
      double n = years * 12;//number of months
      double monthlyPayment = loanAmount * ((r * (Math.pow(1 + r, n))) / (Math.pow(1 + r, n) - 1));
      double totalPayment = monthlyPayment * n;
      double principal = 0;
      int paymentNumber = 1;
      
      System.out.printf(
         "Payment#%18s%18s%18s\n", "Interest", "Principal", "Balance");
      
      //Use loop to calculate payments and display results
      while (n > 0){
         interest = loanAmount * r;
         principal = monthlyPayment - interest;
         loanAmount = loanAmount - principal;
         System.out.printf(
            "%-5d%18.2f%18.2f%21.2f\n", paymentNumber, interest, principal, loanAmount);
         n--;//decrement number of months remaining
         paymentNumber++;
         
         
      }  
   }
}
