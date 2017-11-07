/*Use nested loops to display patterns 
in four separate programs.*/

public class Exercise518D {
   public static void main(String [] args) {
      //Declare variables
      int rowLength = 6;
      int numberLines = 6;
      System.out.printf("Pattern D\n");
      
               //System.out.print("   ");*/
         
       while (rowLength > 0) {
         int dSpaces = numberLines - rowLength;
         while (dSpaces >= 1) {
            System.out.print("  ");
            dSpaces--;  
         }
         int d = 1;
         while (d <= rowLength){
            System.out.print(d + " ");
            d++;
         }
         rowLength--;
         System.out.println();
      }
   }
}
 