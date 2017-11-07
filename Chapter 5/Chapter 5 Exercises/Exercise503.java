/*Write a program that display a table 
converting kilograms to pounds*/

public class Exercise503DW {
   public static void main(String [] args) {
      //Declare variables
      int kilograms = 1;
      double pounds = 0;
      System.out.printf("%-10s%10s\n", "Kilograms", "Pounds");
      do {
         //pounds = 2.2 * kilograms;
         System.out.printf("%-10d%10.1f\n", kilograms, kilograms * 2.2);
         pounds++;
         kilograms = kilograms + 5;
         } while (kilograms < 5);
    
   }
}