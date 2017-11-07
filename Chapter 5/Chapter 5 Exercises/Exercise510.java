/*Write a program that displays all the 
number from 100 to 1000, ten per line, 
that are divisible by 5 and 6. Numbers 
are separated by exactly one space. */

public class Exercise510 {
   public static void main(String [] args) {
   
      int number = 100;//sentinel integer to determine when loop ends
      int row = 10;//integer that counts answers to track line length
      
      while (number < 1001) {
         number++;//increment sentinel 
         
         if (number % 5 == 0 && number % 6 == 0){
            row++; 
            
            if (row % 10 == 0)//line return after ten answers
                System.out.println(number + " ");   
            else 
               System.out.print(number + " ");
         }//end if statement
      }//end while loop
      System.out.println(row);
   } 
}