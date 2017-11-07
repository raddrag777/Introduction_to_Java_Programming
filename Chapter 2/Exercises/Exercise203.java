//Write a program that reads a number in feet, converts
//it to meters and displays the result

import java.util.Scanner;

public class Exercise203 {
   public static void main(String[] args) {
      
      //Create a scanner and request a number to be converted
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for feet: ");
      
      //Read the number and convert it to meters
      double feet = input.nextDouble();
      double meters = feet * .305;
      
      //Display converted feet
      System.out.println(feet + " feet is " + meters + " meters");
   }
}