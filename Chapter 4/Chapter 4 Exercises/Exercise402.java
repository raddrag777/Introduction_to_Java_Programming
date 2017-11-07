/*Write a program that prompts the user 
to enter the latitude and longitude of 
two points on the earth in degrees and 
displays its great circle distance.*/

import java.util.Scanner;

public class Exercise402 {
   public static void main(String [] args) {
      
      //Create scanner and prompt user for and acquire 
      //latitude and longitude of two points on the earth 
      //in degrees
      Scanner input = new Scanner(System.in);
      System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
      double latitudePoint1 = input.nextDouble();
      double longitudePoint1 = input.nextDouble();
      System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
      double latitudePoint2 = input.nextDouble();
      double longitudePoint2 = input.nextDouble();
      
      //Convert degrees to radians
      double x1 = Math.toRadians(latitudePoint1);
      double y1 = Math.toRadians(longitudePoint1);
      double x2 = Math.toRadians(latitudePoint2);
      double y2 = Math.toRadians(longitudePoint2);
      
      //Calculate the great circle distance
      double RADIUS = 6371.01;
      double distance = RADIUS * Math.acos((Math.sin(x1)) * Math.sin(x2) 
         + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
      
      //Display results
      System.out.print("The distance between the two point is " + distance + " km");
   }
}