/* Write a method that computes the sum of the 
digits in an integer. Use the following method header:
      public static int sumDigits(long n)
Write a test program that prompts the user to enter 
an integer and displays the sum of all its digits.*/

public class Exercise602Method {
   public static int sumDigits(long n) {
      long sum = 0;
      long digit = 0;
      
      while (n > 0) {
         digit = n % 10;
         sum +=  digit;
         n /= 10;
      }
      return (int) sum;
   }
}