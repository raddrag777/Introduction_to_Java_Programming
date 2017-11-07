/*Write a program that displays miles/kilometers table*/

public class Exercise506 {
   public static void main(String [] args) {
      int miles = 1;
      int kilometers = 20;
      
      System.out.printf(
         "%-10s%10s%5c%5s%10s%10s\n", "Miles","Kilometers", '|', "     ", "Kilometers", "Miles");
      
      while (miles < 11) {
         System.out.printf(
            "%-10d%10.3f%5c%5s%-10d%10.3f\n", miles, miles * 1.609, 
            '|', "     ", kilometers, kilometers / 1.609);
         miles++;
         kilometers += 5;
            
      } 
   }
}  