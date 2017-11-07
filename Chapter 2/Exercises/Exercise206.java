//Write a program that reads an integer between 0 and 1000 and 
//adds all the digits in the iteger.

import java.util.Scanner;

public class Exercise206 {
   public static void main(String [] args) {
      
      //Create a new scanner and request an integer between
      //0 and 1000
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000: ");
      
      //Receive the integer
      int number = input.nextInt();
      
      //Extract first digit and then divide
      int firstDigit = number % 10;
      int nextNumber = number / 10;
      
      //Extract second digit and then divide
      int secondDigit = nextNumber % 10;
      nextNumber = nextNumber / 10;
      
      //Add the digits
      int digitSum = firstDigit + secondDigit + nextNumber;
      
      //Display results
      System.out.println("The sum of the digits of number " +
        number + " is " + digitSum);
   }   
}