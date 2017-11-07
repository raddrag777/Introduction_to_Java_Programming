/*Write a program that prompts the 
user to enter the year and first day of 
the year and displays the calendar 
table for the year on the console. */

import java.util.Scanner;

public class Exercise529 {
   public static void main(String [] args) {
      
      //Create a scanner, prompt user and acquire 
      //year and first day of the year
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = input.nextInt();
      System.out.print("Enter first day: ");
      int day = input.nextInt();
      
      int month = 1;
      int number = 1;
      int dayOfTheWeek = 0;

      while (month <= 12) {
      
         switch (month){
            case 1: System.out.printf("%20s\n", "January "); break;
            case 2: System.out.printf("%20s\n", "February "); break;
            case 3: System.out.printf("%20s\n", "March "); break;
            case 4: System.out.printf("%20s\n", "April "); break;
            case 5: System.out.printf("%20s\n", "May "); break;
            case 6: System.out.printf("%20s\n", "June "); break;
            case 7: System.out.printf("%20s\n", "July "); break;
            case 8: System.out.printf("%20s\n", "August "); break;
            case 9: System.out.printf("%20s\n", "September "); break; 
            case 10: System.out.printf("%20s\n", "October "); break; 
            case 11: System.out.printf("%20s\n", "November "); break;
            case 12: System.out.printf("%20s\n", "December ");
         }
         System.out.println(" ___________________________________");
         System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon",
            "Tue", "Wed", "Thu", "Fri", "Sat");
            
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
   
            
         month++;
      }
   }
}  