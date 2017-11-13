/*Write a method with the following header to 
display an integer in reverse order: 
   public static void reverse(int number)
Write a test program that prompts the user to 
enter an integer and displays its reversal.*/

import java.util.Scanner;

public class Exercise604Method {
   public static int reverse(int number) {
      int sum = 0; 
      int digit = 0;
      
      while(number > 0) {
         sum *=  10;
         digit = number % 10;
         sum += digit;
         number /= 10;
      }
      return sum;
   }
}