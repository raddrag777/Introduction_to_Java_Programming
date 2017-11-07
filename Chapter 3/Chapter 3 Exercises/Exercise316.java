/*Write a program that displays a random 
coordinate in a rectangle. The rectangle 
is centered at (0,0)with width 100 and height 200.*/

public class Exercise316 {
   public static void main(String [] args) {
      
      int xRandom = (int)(Math.random() * 100);
      int yRandom = (int)(Math.random() * 200);
            
      System.out.println("(" + xRandom + ", " + yRandom + ")");
      //System.out.println(y);
   }
}