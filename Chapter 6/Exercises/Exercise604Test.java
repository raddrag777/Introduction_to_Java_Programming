/* Test program for Exercise604Method*/

import java.util.Scanner;

public class Exercise604Test {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int number = input.nextInt();
      
      int reverse = Exercise604Method.reverse(number);
      
      System.out.print("The reverse of " + number + " is " + reverse);
   }
}