/*Write a program that simulates 
flipping a coin one million times 
and dsiplays the number of heads 
and tails.*/

public class Exercise540 {
   public static void main(String [] args) {
      int heads = 0;
      int tails = 0;
      int times = 0;
      int flip = 0;
      
      while (times < 1000000) {
         flip = (int)(Math.random() * 2);
         if (flip == 1){
            heads++;
         }
         else
            tails++;
         times++;
      }
      System.out.print("Heads = " + heads + " Tails = " + tails);
   }
}