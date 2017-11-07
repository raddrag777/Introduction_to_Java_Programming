/*Write a program that displays all possible 
combinations for picking two numbers from 
integers 1 to 7. Also display the total number 
of all combinations.*/

public class Exercise543 {
   public static void main(String [] args) {
   
      int x1 = 0;
      int x2 = 0;
      int xLoop = 1;
      int sum = 0;
      
      while (xLoop < 7) {
         
         x1 = xLoop;
         x2 = x1 + 1;

         while (x1 < 7){
            
            while (x2 <= 7) {  
               System.out.println(x1 + " " + x2);
               x2++;   
               sum++;
            }
            x1++;            
         }
         xLoop++;
      }
      System.out.println("Total number of combinations is " + sum);
                   
   }
}