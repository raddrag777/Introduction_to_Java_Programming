/*Write a program that prompts the user to 
enter the month and year and dispalys the 
number of days in the month.*/

import java.util.Scanner;

public class Exercise311 {
   public static void main(String [] args) {
      
      boolean isLeapYear;
      
      //Create a scanner and prompt user and acquire month and year
      Scanner input = new Scanner(System.in);
      System.out.print("Enter month number: ");
      int month = input.nextInt();
      System.out.print("Enter year: ");
      int year = input.nextInt();
      month = month - 1;
      
      //Determine number of days in month using a switch
      switch (month) {
         case 0: System.out.print("January"); break;
         case 1: System.out.print("February"); break;
         case 2: System.out.print("March"); break;
         case 3: System.out.print("April"); break;
         case 4: System.out.print("May"); break;
         case 5: System.out.print("June"); break;
         case 6: System.out.print("July"); break;
         case 7: System.out.print("August"); break;
         case 8: System.out.print("September"); break;
         case 9: System.out.print("October"); break;
         case 10: System.out.print("November"); break;
         case 11: System.out.print("December"); 
      }
         
      if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 ||  month == 9 || month == 11)
         System.out.println(" " + year + " had 31 days");
      
      if (month == 3 || month == 5  || month == 8 || month == 10)
         System.out.println(" " + year + " had 30 days");
      
      if (month == 1){
         //Calculate for leap year
         isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
         
         if (isLeapYear)
            System.out.print(" " + year + " had 29 days");
         else
            System.out.print(" " + year + " had 28 days");
      }   
   }
}