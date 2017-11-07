import java.util.Scanner;

public class Exercise306 {
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter weight in pounds
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      
      //Prompt user to enter height in feet and inches
      System.out.print("Enter feet: ");
      double feet = input.nextDouble();
      System.out.print("Enter inches: ");
      double inches = input.nextDouble();
      
      //Convert feet and inches to inches
      double height = inches + feet * 12;
      
      final double KILOGRAMS_PER_POUND = 0.45359237; //constant
      final double METERS_PER_INCH = 0.0254; //constant
      
      //Compute BMI
      double weightInKilograms = weight * KILOGRAMS_PER_POUND;
      double heightInMeters = height * METERS_PER_INCH;
      double bmi = weightInKilograms / (heightInMeters * heightInMeters);
      
      //Display result
      System.out.println("BMI is " + bmi);
      if (bmi < 18.5)
         System.out.println("Underweight");
      else if (bmi < 25)
         System.out.println("Normal");
      else if (bmi < 30)
         System.out.println("Overweight");
      else 
         System.out.println("Obese");
   }
}