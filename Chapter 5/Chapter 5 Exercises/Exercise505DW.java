/*Write a program that displays two tables side by side*/
public class Exercise505DW {
   public static void main(String [] args) {
      int kilograms = 1;
      int pounds = 20;
   
      System.out.printf("%-10s%10s%5c%5s%-10s%10s\n", "Kilograms", "Pounds",
         '|', "     ", "Pounds", "Kilograms");
      do {
          //pounds = 2.2 * kilograms;
         System.out.printf("%-10d%10.1f%5c%5s%-10d%10.2f\n", kilograms, 
            kilograms * 2.2, '|', "     ", pounds, pounds / 2.2); 
         kilograms++;
         pounds += 5;
         } while (kilograms <= 100);
  }
}
