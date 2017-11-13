/*Write a nested loop to print pyramid pattern*/

public class Exercise519 {
   public static void main(String [] args) {
      int numberLines = n;
      int rowLength = n;
      int numberDown = n;
      while (numberLines > 0) {
         int aSpaces = 1;
         //System.out.print(rowLength - numberLines);
         while (aSpaces <= numberLines-1) {
            System.out.print("    ");
            aSpaces++;  
         }

         int countUp = 0;
         int number = 1;
         while (countUp <= rowLength - numberLines){
            System.out.printf("%4d",number);
            number = number * 2;
            countUp++;
         }
         int countDown = 1;
         number = number / 4; 
         while (countDown < 8 &&  countDown <= rowLength - numberLines) {   
            System.out.printf("%4d", number);
            number = number / 2;
            countDown++;
            }
         System.out.println();
         numberLines--; 
      }
   }
}  
/*int spaces = n-1;
      
      for (int i = 1; i <= n; i++){//loops for number of lines
         for (int j = 0; j < spaces; j++) {//loops for spaces
            System.out.print("    ");
         }
         for (int k = i; k > 0; k--) {//loops for count down
            System.out.print(k + "   ");
         }
         System.out.println();//new line
         spaces--;//decrements the number of spaces loops
      }*/
