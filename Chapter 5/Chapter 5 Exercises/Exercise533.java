/*Write a program to find all four perfect
numbers less than 10000.*/

public class Exercise533 {
   public static void main(String [] args) {
      
      System.out.print("The first four perfect numbers are: ");
      int testNumber = 1;

      while (testNumber < 10000){ 
      
         int sum = 0; //Set sum to zero each iteration               
         int denominator = 1; //Set denominator to 1 each iteration
         
         while (denominator <= testNumber / 2) {//increments through denominators
            //find factors and sum them
            if (testNumber % denominator == 0) {
               sum = sum + denominator;
            }   
            
            denominator++;
         }
         //find perfect numbers
         if (sum == testNumber) {
              System.out.print(sum + " ");
            }

         testNumber++;
      }
   }
}