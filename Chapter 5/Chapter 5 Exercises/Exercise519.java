/*Write a nested loop to print pyramid pattern*/

public class Exercise519 {
   public static void main(String [] args) {
      int numberLines = 8;
      int rowLength = 8;
      int numberDown = 8;
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
/*int rowLength = 7;
      int numberLines = 6;
      System.out.printf("Pattern A\n");
      
      while (numberLines > 0) {
         int b = 1;
         while (b <= rowLength - numberLines && b <= 6) {
            System.out.print(b + " ");
            b++;
         } 
         numberLines--;
         System.out.pr*/