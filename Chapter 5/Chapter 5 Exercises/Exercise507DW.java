/*Write a program that computes the tuition 
in ten years and the total cost of four 
years' worth of tuition after the tenth year.*/

public class Exercise507DW {
   public static void main(String [] args) {
      
      double interest = 0.05;
      double tuition = 10000;
      int year = 0;
      
      do {
        tuition = tuition + tuition * interest;
        year++;
        if (year == 9)
         System.out.printf("Tuition in 10 years: $%6.2f\n", tuition);
      } while (year < 15);
      System.out.printf("Cost of four years of tuition: $%6.2f\n", tuition);
   }
}