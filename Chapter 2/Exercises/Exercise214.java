/*Write a program that prompts the user to enter 
a weight in pounds and height in inches and 
displays the BMI*/

import java.util.Scanner;

public class Exercise214 {
   public static void main(String [] args) {
      
      //Create a scanner, prompt user for weight
      //and weight
      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      
      //Prompt user for and acquire weight and 
      //calculate BMI
      System.out.print("Enter height in inches: ");
      double height = input.nextDouble();
      double BMI = (weight *  0.45359427) / (height * 0.0254 * height * 0.0254);
      
      //Display results
      System.out.println("BMI is " + BMI);
   }
}