/*Test program for Exercise603Methods*/

import java.util.Scanner;

public class Exercise603Test {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int number = input.nextInt();
      int userNumber = number;
      
      //System.out.print(Exercise603Method.isPalindrome(number));
      System.out.println(
         number + (Exercise603Method.isPalindrome(number) ? " is " : " is not ")
			+ "a palindrome.");
   }
}