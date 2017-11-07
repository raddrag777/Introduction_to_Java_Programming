/*Write a program that promts the user to 
enter an amount, the annual interest rate, 
and the number of months and displays the 
amount in the savings account after the 
given month.*/

import java.util.Scanner;

public class Exercise530 {
   public static void main(String [] args) {
      
      //Create scanner, request and acquire 
      //amount, interest and months
      Scanner input = new Scanner(System.in);
      System.out.print("Enter savings amount: ");
      double amount = input.nextDouble();
      System.out.print("Enter annual interest rate: ");
      double interest = input.nextDouble();
      System.out.print("Enter number of months: ");
      int totalMonths = input.nextInt();
      
      int months = 1;
      double totalAmount = 0;
                 
      while (months <= totalMonths){
         totalAmount = (amount + totalAmount) * (1 + interest / 1200);
         System.out.printf("Month %2d%3s%5.2f\n", months, ": $", totalAmount);
         months++;
      }
   }
}