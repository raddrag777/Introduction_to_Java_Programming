/*Write a program that prompts the
 user to enter a string and displays 
 the string in reverse order.*/
 
 import java.util.Scanner;
 
 public class Exercise546 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String letters = input.nextLine();
      int lettersLength = letters.length();
      int x = lettersLength - 1;
      
      System.out.print("The reverse string is ");
      
      while (lettersLength > 0) {
         System.out.print(letters.charAt(x));
         x--;
         lettersLength--;
      }
      
      //System.out.print(lettersLength);
   }
 }