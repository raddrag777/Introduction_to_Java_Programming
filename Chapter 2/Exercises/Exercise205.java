//Write a program that reads the subtotal and the 
//gratuity rate, then computes the gratuity and total.

import java.util.Scanner;

public class Exercise205 {
   public static void main(String[] args) {
      
      //Create a new Scanner and then request subtotal
      //and gratuity rate
      Scanner input  = new Scanner(System.in);
      System.out.print("Enter the subtotal and a gratuity rate: ");
      
      //Read subtotal and gratuity rate and then calculate 
      //gratuity and total
      double subtotal = input.nextDouble();
      double gratuityRate = input.nextDouble();
      
      double tip = subtotal * gratuityRate / 100;
      double total = subtotal + tip;
      
      //Display results
      System.out.println("The gratuity is " + tip + " and the total is " 
         + total);
      
  }
}