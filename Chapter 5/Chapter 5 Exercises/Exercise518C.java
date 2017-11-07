/*Use nested loops to display patterns 
in four separate programs.*/

public class Exercise518C {
   public static void main(String [] args) {
      //Declare variabl es
      int rowLength = 7;
      int numberLines = 6;
      System.out.printf("Pattern C\n");
      
      while (numberLines > 0) {
         int aSpaces = 1;
         //System.out.print(rowLength - numberLines);
         while (aSpaces <= numberLines-1) {
            System.out.print("  ");
            aSpaces++;  
         }

         int countC = 1;
         while (countC <= rowLength - numberLines){
            System.out.print(countC + " ");
            countC++;
         }
         System.out.println();
         numberLines--; 
         
      }
   }
}
 