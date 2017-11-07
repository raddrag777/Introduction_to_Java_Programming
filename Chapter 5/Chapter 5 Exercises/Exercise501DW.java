/*Write a program that reads an unspecified 
number of integers, determines how manu 
positive and negative values have been read, 
and computes the total and average of the input 
values (not counting zeroes) Your program 
ends with the input 0. Display the average 
as a floating point number.*/

import java.util.Scanner;

public class Exercise501DW {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer, the input ends if it is 0: ");
      
      int positives, negatives, digitIn;
      positives = negatives = 0;
      double numberOfDigits, sum;
      numberOfDigits = sum = 0;
             
      do {
         digitIn = input.nextInt();
         if (digitIn > 0) {
            sum += digitIn;
            positives++;
         }
         else if (digitIn < 0) {
            sum += digitIn;
            negatives++;
         }
         else {
            break;
         }
         numberOfDigits++;
      
      
      }while (digitIn != 0);
      System.out.println("The number of positives is " + positives);
      System.out.println("The number of negatives is " + negatives);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + sum / numberOfDigits);
   }
}