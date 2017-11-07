//Write a program that converts pounds into kilograms
import java.util.Scanner;

public class Exercise204 {
   public static void main(String[] args) {
      
      //Create a Scanner and request the user enters a
      //number for pounds
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number in pounds: ");
      
      //Get input and convert pounds to kilograms
      double pounds = input.nextDouble();
      double kilograms = pounds * 0.454;
      
      //Display results
      System.out.println(pounds + " pounds is " + kilograms + 
         " kilograms");
   }
}