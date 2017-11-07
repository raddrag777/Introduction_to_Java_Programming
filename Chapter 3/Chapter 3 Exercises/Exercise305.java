/* Write a program that prompts the user to enter 
an integer for today's day of the week. Also prompt 
the user to enter the number of days after today for 
a future day and display the gurute day of the week.*/

import java.util.Scanner;

public class Exercise305 {
   public static void main(String [] args) { 
   
   //Create a scanner 
   Scanner input = new Scanner(System.in);
   
   //Prompt user for and acquire integer for todays day of the week
   System.out.print("Enter today's day: ");
   int dayOfTheWeek = input.nextInt();
   
   //Prompt user for and acquire number of days after today
   System.out.print("Enter the number of days elapsed since today: ");
   int daysElapsed = input.nextInt();
   
   //Determine which day is given
   switch (dayOfTheWeek) {
      case 0: System.out.print("Today is Sunday");
      case 1: System.out.print("Today is Monday"); break;
      case 2: System.out.print("Today is Tuesay"); break;
      case 3: System.out.print("Today is Wednesday"); break;
      case 4: System.out.print("Today is thursday") ; break;
      case 5: System.out.print("Today is Friday"); break;
      case 6: System.out.print("Today is Saturday");
      }   
   
      //Find future day and display results
   int futureDay = dayOfTheWeek + (daysElapsed % 7);
   
   switch (futureDay) {
      case 0: System.out.print(" and the future day is Sunday"); break;
      case 1: System.out.print(" and the future day is Monday"); break;
      case 2: System.out.print(" and the future day is Tuesday"); break;
      case 3: System.out.print(" and the future day is Wenesday"); break;
      case 4: System.out.print(" and the future day is Thursday"); break;
      case 5: System.out.print(" and the future day is Friday"); break;
      case 6: System.out.print(" and the furure day is Saturday");
   }
   }
}