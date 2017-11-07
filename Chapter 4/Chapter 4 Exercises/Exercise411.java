/*Write a program that prompts the user 
to enter an integer between 0 and 15 and 
displays its corresponding hex number.*/

import java.util.Scanner;

public class Exercise411 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal value (0 to 15): ");
      int i = input.nextInt();
      
      if (i > 15)
         System.out.print(i + " is an invalid input");

      else if (i > 10){
          
         i = i - 10;
         System.out.print("The decimal value is ");
         
         switch (i){
            case 0: System.out.print("A"); break;
            case 1: System.out.print("B"); break;
            case 2: System.out.print("C"); break;
            case 3: System.out.print("D"); break;
            case 4: System.out.print("E"); break;
            case 5: System.out.print("F"); 
         }
      }
      else
         System.out.print("The decimal value is " + i);
      
   }
}