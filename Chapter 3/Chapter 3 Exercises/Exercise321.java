/*Write a program that prompts the user to enter a 
year, month, and day of the month, and displays 
the name of the day of the week.*/

import java.util.Scanner;
 
public class Exercise321 {
   
   public static void main(String [] args) {
   
//Create a scanner and prompt and acquire year,
//month, and day of the month from user
   Scanner input = new Scanner(System.in);
   System.out.print("Enter year: ");
   int year = input.nextInt();
   System.out.print("Enter month: ");
   int month = input.nextInt();
   System.out.print("Enter day of the month: ");
   int dayOfTheMonth = input.nextInt();
   
//Make adjustments for Jan and Feb in equation
   if (month == 1 || month == 2){
      year--;
      month = month + 12;
   }
   System.out.println(month + " " + year); 
//Calculate century and year of the century for equation 
   int j = year / 100;
   int k = year % 100;
   System.out.println(j + " " + k);
//Calculate dayOfTheWeek using Zeller's congruence   
   int dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1) / 10)
      + k + (k / 4) + (j / 4) + 5 * j) % 7;

//Display results
   System.out.print("Day of the week is ");

//Use switch to output dayOfTheWeek  
   switch (dayOfTheWeek) {
      case 0: System.out.print("Saturday"); break;
      case 1: System.out.print("Sunday"); break;
      case 2: System.out.print("Monday"); break;
      case 3: System.out.print("Tuesday"); break;
      case 4: System.out.print("Wednesday"); break;
      case 5: System.out.print("Thursday"); break;
      case 6: System.out.print("Friday");
   }
   }
}