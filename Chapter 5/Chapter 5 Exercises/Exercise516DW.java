/*Write a program that prompts the 
user to enter an integer and displays 
all its smallest factors in 
increasing order.*/

import java.util.Scanner;

public class Exercise516DW {
   public static void main(String [] args) {
      
      //Create scanner, request and acquire integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int number = input.nextInt();
      int index = 2; // Numbers to test as factors 

		// Find and display all the smallest factors in increasing order
		do {
			// Test as a factor of number
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number = number / index; 
			}
			else
				index++; // Increment index
		} while (number/ index !=1);
      //Print what is left and a period
		System.out.println(number + ".");  
   }
}
