/*Test for 602method */

import java.util.Scanner;

public class Exercise602Test {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter digit: "); 
      long num = input.nextLong();
      
         
      System.out.print(Exercise602Method.sumDigits(num));
   }
}