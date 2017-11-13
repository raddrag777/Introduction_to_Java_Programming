/*Use nested loops to display patterns 
in four separate programs.*/

public class Exercise518A {
   public static void main(String [] args) {
      //Declare variables
      int rowLength = 7;
      int numberLines = 6;
      System.out.printf("Pattern A\n");
      
      while (numberLines > 0) {
         int b = 1;
         while (b <= rowLength - numberLines && b <= n) {
            System.out.print(b + " ");
            b++;
         } 
         numberLines--;
         System.out.println();
      }
   }
}
 