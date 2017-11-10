/*Write the methods with the following headers:
      public static int reverse(int number)
      public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome.
Write a test program that prompts the user to enter 
an integer and reports whether the integer 
is a palindrome.*/

public class Exercise603Method {
   public static int reverse(int number) {
      int digit = 0;
      int sum = 0;
      
      while (number > 0) {
         sum *= 10;
         digit = number % 10;
         sum += digit;
         number /= 10;
      }
   }
   
   public static boolean isPalindrome(int number) {
      return number == reverse(number);
   }
}