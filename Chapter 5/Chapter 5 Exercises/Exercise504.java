/*Write a program that displays a miles 
to kilometers conversion table*/

public class Exercise504 {
   public static void main(String [] args) {
      int miles = 1;
      double kilometers = 1;
      System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");
      while (miles < 11){
         
         System.out.printf("%-10d%-10.3f\n", miles, miles * 1.609);
         miles++; 
      }
         
   }
}