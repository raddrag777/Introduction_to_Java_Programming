/*Write a program that finds the minimum 
sales you have to generate in order to 
make $30,000.*/

public class Exercise539 {
   public static void main(String [] args) {
          
      double salary = 0;
      double sales = 0; 
                  
      while (salary < 30000) {
         salary = 5000;
         salary = salary + (5000 * .08) + (5000 * .1) + ((sales - 10000) * .12);  
         sales += 0.01;
      }
      System.out.printf(
         "%10s%6.2f%10s", "You need sales of $", sales, " to earn $30,000.");
   }
}