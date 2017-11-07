/*Write a program that reads the folowing 
information and prints a payroll statement:
Employee's name
Number of hours worked in a week
Hourly pay rate
Federal tax witholding rate
State tax witholding rate*/
import java.util.Scanner;

public class Exercise423 {
   public static void main(String [] args) {
      //Create a scanner and request and acquire 
      //above information from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee's name: ");
      String employeeName = input.nextLine();
      System.out.print("Enter number of hours worked in a week: ");
      String weeklyHours = input.nextLine();
      System.out.print("Enter the hourly pay rate: ");
      String payRate = input.nextLine();
      System.out.print("Enter federal tax witholding rate: ");
      String fedRate = input.nextLine();
      System.out.print("Enter state tax witholding rate: ");
      String stateRate = input.nextLine();
      
      //retrieve doubles from strings
      double wH = Double.parseDouble(weeklyHours);
      double pR = Double.parseDouble(payRate);
      double fR = Double.parseDouble(fedRate);
      double sR = Double.parseDouble(stateRate);
      
      //Calculate gross pay and taxes and net pay
      double grossPay = pR * wH;
      double federalTaxes = grossPay * fR;
      double stateTaxes = grossPay * sR;
      double totalDeduction = federalTaxes + stateTaxes;
      double netPay = grossPay - totalDeduction;
        
      //Display results
      System.out.println("Emplyee name: " + employeeName);
      System.out.println("Hours worked: " + weeklyHours);
      System.out.println("Pay Rate: $" + payRate);
      System.out.println("Gross Pay: $" + grossPay);
      System.out.println("Deductions: ");
      System.out.printf("Federal Witholding (%6.2f ): %6.2\n", fedRate, federalTaxes);
      //System.out.printf("%20s%6.2f%20s%6.2$\n", "   State Witholding (", stateRate, 
         //"): ", stateTaxes);
      //System.out.printf("%20s%6.2%f$\n", "Total Deduction: ", totalDeduction);
      //System.out.printf("%20s%6.2f$", "Net Pay: ", netPay);
      
      
   }
}
