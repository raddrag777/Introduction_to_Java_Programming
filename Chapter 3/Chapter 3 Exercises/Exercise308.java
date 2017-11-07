/*Write a program that prompts the 
user to enter three integers and 
display the integers in non-decreasing 
order*/

import java.util.Scanner;

public class Exercise308 {
   public static void main(String [] args) {
      
      //Create a scanner and prompt user for three integers
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three integers: ");
      
      //Declare three ints to hold order
      //int temp = 0;
       
      
      //Acquire integers and compare largest to smallest
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();
      
      //number1 and number to are compared. If number1 is less than 
      //number2, swap.
      if (number1 > number2) {
         int temp = number1;
         number1 = number2;
         number2 = temp;
      }
      
      //number2 is compared to number3. If number2 is less than
      //number3, swap those.
      if (number2 > number3) {
         int temp = number2;
         number2 = number3;
         number3 = temp;
      }
      
      //Recompare number1 and number2 and swap if number2 is larger
      if (number1 > number2) {
         int temp = number1;
         number1 = number2;
         number2 = temp;
      }
   
    //Display results
    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
  }
}