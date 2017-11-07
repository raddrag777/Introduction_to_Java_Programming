/*Write a program that prompts the user to enter 
values for a, b, and c and displays the result 
based on the discriminant. If the discriminant 
is positive, display two roots. If the discriminant 
is 0, display one root. */


import java.util.Scanner;

public class Exercise301 {
   public static void main(String [] args) {
      
      //Create scanner
      Scanner input = new Scanner(System.in);
      
      //Prompt user for a, b, c
      System.out.print("Enter a, b, c:");
      
      //Acquire a, b, c
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      //calculate discriminants
      double discriminant = Math.pow(b, 2) - 4 * a * c;
      
      //Compute roots of equation
      double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
      double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

      if (discriminant > 0) {
         System.out.println("The equation has two roots " + 
         root1 + " and " + root2); 
      }     
      else if (discriminant == 0) {
         if (root1 ==0)
            System.out.println("The equation has one root " + root1);
         else
            System.out.println("The equation has one root " + root2);
      }
       
      else
         System.out.println("The equation has no real roots.");     
   }
}

//((-b + Math.pow((discriminant, 0.5)) / 2 * a);

