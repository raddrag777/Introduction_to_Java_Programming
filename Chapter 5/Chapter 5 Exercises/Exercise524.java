/*Write a program to sum the follwoing series: 
1/3 + 3/5 + 5/7 +7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99*/

public class Exercise524 {
   public static void main(String [] args) {
      double n = 1;
      double sum = 0;
      
      while (n < 98) {
         sum+= n / (n + 2);
         n++;
      }
      System.out.print("Sum = " + sum);
   }
}