/*Write exercise 539 letting the 
user enter COMMISSION_SOUGHT instead 
of fixing it as a constant.*/

import java.util.Scanner;

public class Exercise542 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the commission you seek: ");
      final double COMMISSION_SOUGHT = input.nextDouble();
      double commission = 1;
      double sales = 1;
      double salesLoop = 0;    
      while (commission < COMMISSION_SOUGHT){
         
         if (sales <= 5000){
            commission = sales * .08;
            sales = sales + 0.01;       
         }
         
         if (sales <= 10000 && sales > 5000) {
            salesLoop = sales;
            commission = 400;
            salesLoop = salesLoop - 4999;
            commission = commission + salesLoop * 0.1;
            sales = sales + 0.01;
         }
         
         if (sales > 10000) {
            salesLoop = sales;
            commission = 900;
            salesLoop = salesLoop - 9999;
            commission = commission + (salesLoop * 0.12);
            sales = sales + 0.01;
         }
      } 
      System.out.printf(
         "%8s%5.2f%5s%5.2f", "You will earn $", COMMISSION_SOUGHT, 
         " commission when sales are $", sales); 
   }
}