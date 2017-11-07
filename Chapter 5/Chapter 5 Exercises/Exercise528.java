/*Write a program that prompts the 
user to enter the year and first 
day of the year, and displays the 
first day of each month in the year.*/

import java.util.Scanner;
 
public class Exercise528 {
   
   public static void main(String [] args) {
   
   //Create a scanner and prompt and acquire year
   Scanner input = new Scanner(System.in);
   System.out.print("Enter year: ");
   int year = input.nextInt();
   int month = 1;
   
   //Calculate century and year of the century for equation 
   int j = year / 100;
   int k = year % 100;
   int q = 1;
   
   while (month <= 12) {
             
      switch (month){
         case 1: System.out.print("January "); break;
         case 2: System.out.print("February "); break;
         case 3: System.out.print("March "); break;
         case 4: System.out.print("April "); break;
         case 5: System.out.print("May "); break;
         case 6: System.out.print("June "); break;
         case 7: System.out.print("July "); break;
         case 8: System.out.print("August "); break;
         case 9: System.out.print("September "); break; 
         case 10: System.out.print("October "); break; 
         case 11: System.out.print("November "); break;
         case 12: System.out.print("December ");
      }                     
      System.out.print("1, " + year + " is ");
      
      //Make adjustments for Jan and Feb in equation
      if (month == 1 || month == 2){
         year--;
         month = month + 12;
         k--;
      }
      //Calculate dayOfTheWeek using Zeller's congruence   
      int dayOfTheWeek = (1 +(26 * (month + 1) / 10) + 
         k + (k / 4) + (j / 4) + 5 * j) % 7;
         
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
      //Readjust for year, month and k if jan or feb
      if (month == 13 || month == 14){
         year++;
         month = month - 12;
         k++;
         }
      month++;//increments month for while loop
      System.out.println();
      }
   }
}