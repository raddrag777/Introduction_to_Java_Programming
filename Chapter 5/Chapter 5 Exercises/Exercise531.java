/*Write a program that prompts the user 
to enter an amount, annual percentage yield, 
and the number of months and displays 
a table as shown in the sample run.*/

import java.util.Scanner;

public class Exercise531 {
   public static void main(String [] args) {
      
      //Create a scanner, prompt user and 
      //acquire amount, interest, and months
      Scanner input = new Scanner(System.in);
      System.out.print(
         "Enter the initial deposit amount: ");
      double amount = input.nextDouble();
      System.out.print(
         "Enter annual percentage yield: ");
      double annualPercentage = input.nextDouble();
      System.out.print(
         "Enter maturity period(number of months): ");
      int totalMonths = input.nextInt();
      
      System.out.println("Month  CD Value");
      
      int months = 1;
            
      while (months <= totalMonths) {
         amount = amount + (amount  * annualPercentage / 1200); 
         System.out.printf("%-2d%5s%8.2f\n", months, "    ", amount);
         months++;
      }
   }
}  