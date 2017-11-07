/* Write a program that randomly generates an integer 
between 1 and 12 and displays the English month name 
January, February, ..., Decembeer for the number 1, 
2, ..., 12, accordingly.*/

import java.util.Scanner;

public class Exercise304 {
   public static void main(String [] args) {
      
      //Generate a random number between 1 and 12
      int month = (int)(Math.random() * 12 + 1);
       
      //Use a switch to assign animal to month
      switch (month % 12) {
         case 0: System.out.print(" January"); break;
         case 1: System.out.print(" February"); break;
         case 2: System.out.print(" March"); break;
         case 3: System.out.print(" April"); break;
         case 4: System.out.print(" May"); break;
         case 5: System.out.print(" June"); break;
         case 6: System.out.print(" July"); break;
         case 7: System.out.print(" August"); break;
         case 8: System.out.print(" September"); break;
         case 9: System.out.print(" October"); break;
         case 10: System.out.print(" November"); break;
         case 11: System.out.print(" December"); 
      }
   }
}