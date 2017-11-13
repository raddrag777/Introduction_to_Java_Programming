/*Write a program to display a pattern.
The method header is:
   public static void displayPattern(int n)*/
   
import java.util.Scanner;

public class Exercise606 {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int n = input.nextInt();
      
      displayPattern(n);  
   }
   
   public static void displayPattern(int n) {
      int spaces = n-1;
      
      for (int i = 1; i <= n; i++){//loops for number of lines
         for (int j = 0; j < spaces; j++) {//loops for spaces
            System.out.print("    ");
         }
         for (int k = i; k > 0; k--) {//loops for count down
            System.out.print(k + "   ");
         }
         System.out.println();//new line
         spaces--;//decrements the number of spaces loops
      }
             
   }
}