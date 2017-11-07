/*Write a program that prompts the user 
to enter a year and the first three letter 
of a month name (with the first letter in 
uppercase) and displays the number of days 
in the month.*/

import java.util.Scanner;

public class Exercise417 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for year
      Scanner input = new Scanner(System.in); 
      System.out.print("Enter a year: ");
      
      //Acquire year and request month
      int year = input.nextInt();
      System.out.print("Enter a month: ");
      
      //Acquire month as a string
      String month = input.next();
      //String s = month.substring(0,3);
      
      //Calculate leap year
      boolean isLeapYear = ((year % 4 == 0) && 
            (year % 100 != 0) || (year % 400 == 0));


      // Display the number of day in the month
		System.out.print(month + " " + year + " has ");
		
		if ( month.equals("Jan") || month.equals("Mar") || 
			  month.equals("May") || month.equals("Jul") ||
			  month.equals("Aug") || month.equals("Oct") ||
			  month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Apr") || month.equals("Jun") || 
			month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		else
			System.out.println(((isLeapYear) ? 29 : 28) + " days");	
         /*if (!isLeapYear) {
         System.out.println(s + " " + year + " has 29 days");
            switch (s){
               case "Jan": System.out.print("31"); break;
               case "Feb": System.out.print("28"); break;
               case "Mar": System.out.print("31"); break;
               case "Apr": System.out.print("30"); break;
               case "May": System.out.print("31"); break;
               case "Jun": System.out.print("30"); break;
               case "Jul": System.out.print("31"); break; 
               case "Aug": System.out.print("31"); break;
               case "Sep": System.out.print("30"); break;
               case "Oct": System.out.print("31"); break;
               case "Nov": System.out.print("30"); break;
               case "Dec": System.out.print("31"); 
            }
        }                
        
        else
            System.out.println(year + " is not a leap year.");*/
      
      
   }  
}