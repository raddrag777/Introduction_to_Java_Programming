/*Use nested loops to display patterns 
in four separate programs.*/

public class Exercise518B {
   public static void main(String [] args) {
      //Declare variables
      int rowLength = 6;
      int numberLines = 6;
      System.out.printf("Pattern A%15s%15s%15s\n", "Pattern B",
         "Pattern C", "Pattern D");
      
      while (rowLength > 0) {
         int b = 1;
         while (b <= rowLength) {
            System.out.print(b + " ");
            b++;
         }
         int bSpaces = numberLines - rowLength;
         while (bSpaces >= 1) {
            System.out.print(". ");
            bSpaces--;
         }
         System.out.print("   ");
                 
         /*int cSpace = 1;
         while (cSpaces > 0) {
            System.out.print(" ");
            cSpaces--;
         }
         int c = cSpace;
         while (c < rowLength) {
            System.out.print(c);
            c++;
         }

         System.out.print("   ");
         
         int d = 1;
         while (d < rowLength) {
            System.out.print(d);
            d++;
         }
         int dSpaces = d;
         while (dSpaces <= rowLength) {
            System.out.print(" ");
            dSpaces++;
         }
         //System.out.print("   ");*/
         System.out.println();
         rowLength--; 
         
      }
   }
}
 