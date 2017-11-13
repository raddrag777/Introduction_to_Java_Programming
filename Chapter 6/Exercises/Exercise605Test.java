/*Test program for Exercise605Method*/
import java.util.Scanner;

public class Exercise605Test {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
      
      Exercise605Method.displaySortedNumbers(num1, num2, num3);
   }
}