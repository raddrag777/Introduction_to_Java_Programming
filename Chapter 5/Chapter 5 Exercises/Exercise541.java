/*Write a program that reads integers, 
finds the largest of them and counts 
its occurrences.*/

import java.util.Scanner;

public class Exercise541 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers: ");
      int max = input.nextInt();
      
      int number = 1;
      int count = 0;
      
      while (number != 0) {
         number = input.nextInt();
                  
         if (number == max) {
            count++;
         }
         if (number > max) {
            max = number;
            count = 1;
         }
      }
      System.out.println("The largest number is " + max);
      System.out.println(
         "The occurrence count of the largest number is " + count);
   }
}