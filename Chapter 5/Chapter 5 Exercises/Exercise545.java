/*Write a program that prompts the user 
to enter ten numbers, and displays the 
mean and statndard deviations of these
 numbers.*/
 
 import java.util.Scanner;
 
 public class Exercise545 {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      double number, deviation, mean, sum, sumSquared;;
      number = deviation = mean = sum = sumSquared = 0;
               
      while (number < 10) {  
         double inputNumber = input.nextDouble();
         sum += inputNumber;
         sumSquared = sumSquared + Math.pow(inputNumber, 2);
         number++;
         System.out.println(inputNumber + " " + sum + " " + sumSquared);
      }   
      mean = sum / 10;
      deviation = Math.sqrt((sumSquared - (Math.pow(sum, 2) / 10 )) / (10 - 1));
      System.out.println("The mean is " + mean);
      System.out.printf("The standard deviation is %.5f\n", deviation); 
   }
 }
 