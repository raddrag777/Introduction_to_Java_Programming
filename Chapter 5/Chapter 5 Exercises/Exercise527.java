/*Write a program that displays all the 
leap years, ten per line, from 101 to 2100, 
separated by exactly one space. Also display 
the number of leap years in this period.*/

public class Exercise527 {
   public static void main(String [] args) {
      
      //Initialize variables
      int year = 101;
      int numberLeapYear = 0;
      int row = 1;
      boolean isLeapYear;
      
      while (year < 2101) {   
         if (isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            if (row % 10 == 0) {
               System.out.println(year + " ");
               numberLeapYear++;
               row++;
            }
            else {
               System.out.print(year + " ");
               numberLeapYear++; 
               row++;
            }
         }
         year++;
      }
      System.out.printf("\nNumber of Leap Years = " + numberLeapYear);
   }
}