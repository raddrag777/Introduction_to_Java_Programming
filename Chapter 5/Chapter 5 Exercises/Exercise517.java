/*Write a program that prompts the user to enter 
an integer from 1 to 15 and displays a pyramid.*/

import java.util.Scanner;

public class Exercise517 {
   public static void main(String [] args) {
      
      int x = 1;
      
      //Create scanner and request and acquire int
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer between 1 and 15: ");
      int numberLines = input.nextInt();

      while (numberLines < 1 || numberLines > 15){
         System.out.print(
         "Invalid entry: Enter integer between 1 and 15: ");
         numberLines = input.nextInt();
      }
      int rowLength = 1;//sentinel value
      
      while (rowLength <= numberLines) {//runs for number of lines inputted
         int spaces = numberLines - rowLength;
         while (spaces >= 1){//gives spaces before first number
            System.out.print("  ");
            spaces--;
         }
         int numberUp = 1;
         while(numberUp <= rowLength){//prints ascending numbers
            System.out.print(numberUp + " ");
            numberUp++;
         }
         int numberDown = rowLength-1;
         while (numberDown > 0){//prints descending numbers
            System.out.print(numberDown + " ");
            numberDown--;
         }
         System.out.println();
         rowLength++;//increments sentinel value
      }
   }
}