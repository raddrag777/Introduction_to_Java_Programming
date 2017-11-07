/*Write a program that reads and calculates
the sum of an unspcified number of integers.*/

import java.util.Scanner;

public class SentinelValue {
   public static void main(String [] args) {
      //Create a scanner
      Scanner input = new Scanner(System.in);
      
      //Read an initial data 
      System.out.print(
         "Enter an integer(the input end if it is 0): ");
      int data = input.nextInt();
      
      //Keep reading data until the input is 0
      int sum = 0;
      while (data != 0) {
         sum += data;
         
         //read the next data
         System.out.print(
            "Enter an integer (the input ends if it is 0): ");
         data = input.nextInt();
      }//end while loop
      System.out.print("The sum is " + sum);
   }
}