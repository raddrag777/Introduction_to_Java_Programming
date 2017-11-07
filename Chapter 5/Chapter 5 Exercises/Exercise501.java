/*Write a program that reads an unspecified 
number of integers, determines how many 
positive and negative values have been read, 
and computes the total and average of the 
input values(not counting zeros). Your program 
ends with the input 0. Display the average as
a floating point number.*/

import java.util.Scanner;

public class Exercise501 {
   public static void main(String [] args) {
      int positives = 0;
      int negatives = 0;
      int sum = 0;
      
      //Create Scanner, request and acquire integers
      Scanner input = new Scanner(System.in);
      
      System.out.print(
         "Enter an integer, the input ends if it is 0: ");
      int number = input.nextInt();  
      
      if (number == 0)
         System.out.print("No numbers are entered except zero");  
      
      else {
         while (number != 0) {//Zero terminates input
            sum = sum + number;
   
            if (number > 0){
               positives++;
            }
            else {
                negatives++;
            }   
            number = input.nextInt();
         }
         System.out.println("This is sum " + sum);
         System.out.println("+" +positives);
         System.out.println("-" +negatives);
      }
      
   }
}