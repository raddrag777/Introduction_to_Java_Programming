/*Write a program that prompts the user 
to enter two strings and displays the 
largest common prefix of the two strings.*/

import java.util.Scanner;

public class Exercise551 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first string: ");
      String string1 = input.nextLine();
      System.out.print("Enter the second string: ");
      String string2 = input.nextLine();
      
      int x, y;
      x = y = 0;
      char ch1, ch2;
      
      if (string1.charAt(0) != string2.charAt(0)) {
         System.out.print(string1 + " and " + string2 + " have no common prefix");
         x++;
      }
      
      while (x == y) {
         ch1 = string1.charAt(x);
         ch2 = string2.charAt(y);
                  
         if (ch1 == ch2) {
            System.out.print(ch1);
            x++;
            y++;
         }
         else
            x++;
      }
   }  
}