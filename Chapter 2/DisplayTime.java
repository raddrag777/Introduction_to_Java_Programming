import java.util.Scanner;

public class DisplayTime {
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      //Prompt the user for more input
      System.out.print("Enter an integer for second: ");
      int seconds = input.nextInt();
      
      int minutes = seconds / 60;//Find the minutes in seconds
      int remainingSeconds = seconds % 60;//Seconds remaining
      System.out.println(seconds + " seconds is " + minutes + 
         " minutes and " + remainingSeconds + " seconds."); 
     
   }
}