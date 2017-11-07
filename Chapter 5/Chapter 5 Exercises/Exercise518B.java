/*Use nested loops to display patterns 
in four separate programs.*/

public class Exercise518B {
   public static void main(String [] args) {
      //Declare variables
      int rowLength = 6;
      int numberLines = 6;
      System.out.println("Pattern B");
      
      while (rowLength > 0) {
         int b = 1;
         while (b <= rowLength) {
            System.out.print(b + " ");
            b++;
         }
         System.out.println();
         rowLength--; 
      }
   }
}
 