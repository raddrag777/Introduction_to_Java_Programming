/* Write a method with the following header to 
display three numbers in increasing order:
   
   public static void displaySortedNumbers(
      double num1, double num2, double num3)
      
Write a test program that prompts the user to 
enter three numbers and invokes the method to 
display them in increasing order. */

//import java.util.Scanner;

public class Exercise605Method {

   //public static void main(String[] args) {
   public static void displaySortedNumbers(
      double num1, double num2, double num3){
      
      double temp = 0;
      
      if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		// Display result
		System.out.println(num1 + " " + num2 + " " + num3);

   }
}