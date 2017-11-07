//Write a program that prompts the user to enter the minutes 
//and displays then number of years and days for the minutes

import java.util.Scanner;

public class Exercise207 {
   public static void main(String [] args) {
   
   //Create a scanner and then ask user for minutes
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number of minutes: ");
   
   //Receive input and calculate number of days
   int minutes = input.nextInt();
   int numberOfDays = (minutes / 60) / 24;
   
   //Calculate the number of years from days
   int numberOfYears = numberOfDays / 365;
   
   //Calculate the number of days
   int remainingDays = numberOfDays - (numberOfYears * 365); 
   
   //Display results
   System.out.println(minutes + " minutes is approximately " +
      numberOfYears + " years and " + remainingDays + " days");
   System.out.println(numberOfDays);
   System.out.println(numberOfYears);
   System.out.println(remainingDays);
   }
} 