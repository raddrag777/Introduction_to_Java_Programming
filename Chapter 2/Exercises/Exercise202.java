//Write a program that reads in the radius and length of a 
//cylinder and computes the area and volume

import java.util.Scanner;

public class Exercise202 {
   public static void main(String[] args) {
      //Create a scanner input and request the radius and length
      //of a cylinder
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius and length of a cylinder: ");
      
      //Input radius and length and compute volume and area
      double radius = input.nextDouble();
      double length = input.nextDouble();
      double area = radius * radius * 3.14159;
      double volume = area * length;
      
      //Display the area and volume of the cylinder
      System.out.println("The area is: " + area);
      System.out.println("The volume is: " + volume);
   }
}