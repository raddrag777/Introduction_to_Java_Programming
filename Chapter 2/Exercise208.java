//Revise ShowCurrentTime.java so that it prompts
//the user to enter the time zone offset to GMT 
//and displays the time in the specified time zone.

import java.util.Scanner;

public class Exercise330 {
   public static void main(String [] args) {
      
      //Create a scanner and request the time zone offset
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the time zone offest to GMT: ");
      
      //Receive offset
      long offset = input.nextLong();             
      
      //Find current time in GMT
      //Obtain the total milliseconds since midnight
      //Jan. 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      
      //Obtain the total seconds since midnight, Jan.1, 1970
      long totalSeconds = totalMilliseconds / 1000;
      
      //Compute the current second in the minute in the hour
      long currentSecond = totalSeconds % 60;
      
      //Obtain the total minutes
      long totalMinutes = totalSeconds / 60;
      
      //Compute the current minute in the hour
      long currentMinute = totalMinutes % 60; 
      
      //Obtain the total hours
      long totalHours = totalMinutes / 60;
      
      //Compute the current hour
      long currentHour = totalHours % 24;
      
      //Adjust the current time to the offset
      currentHour = (currentHour + offset + 24) % 24;
      
      //Display results
      System.out.println("Current time is " + currentHour + ":" 
         + currentMinute + ":" + currentSecond + " GMT");
   }
}