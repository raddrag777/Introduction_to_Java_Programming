/* Write a program that prompts the user to 
enter the three points for p0, p1, and p2 and 
displays whterh p2 is on the left of the line 
from p0 to p1 on the right , or on the same line. */

import java.util.Scanner;

public class Exercise332 {
   
   public static void main(String [] args) {

//Create a scanner and prompt user for and acquire three points
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for p0, p1, and p2: ");
      double x0 = input.nextDouble();
      double y0 = input.nextDouble();
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble(); 
      double y2 = input.nextDouble();
      
//
      double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
      
      if (condition > 0)
         System.out.println("(" + x2 + ", " + y2 
            + " is on the left side of the line from (" 
            + x0 + ", " + y0 + ")" + " (" + x1 + ", " + y1 + ")");
      else if (condition == 0)
         System.out.println("(" + x2 + ", " + y2 
            + " is on line from (" + x0 + ", " 
            + y0 + ")" + " (" + x1 + ", " + y1 + ")");
      else 
         System.out.println("(" + x2 + ", " + y2 
            + " is on the right side of the line from (" + x0 + ", " 
            + y0 + ")" + " (" + x1 + ", " + y1 + ")");

      
     //System.out.print(condition);
   }
}