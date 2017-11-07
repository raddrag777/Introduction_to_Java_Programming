/* Write a program that prompts the user to 
enter the center x-, y-coordinates, width, 
and height of two rectangles and determines 
whether the second rectangle is inside the 
first or overlaps with the first.*/

import java.util.Scanner;

public class Exercise328 {
   
   public static void main(String [] args) {
      
//Create scanner and acquire coordinates from user

   Scanner input = new Scanner(System.in);
   System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
   double x1 = input.nextDouble();
   double y1 = input.nextDouble();
   double width1 = input.nextDouble();
   double height1 = input.nextDouble();
   
   System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
   double x2 = input.nextDouble();
   double y2 = input.nextDouble();
   double width2 = input.nextDouble();
   double height2 = input.nextDouble();
   
//Determine if r2 is inside r1
   double cornerR1Ax = (width1 / 2) + x1; 
   double cornerR1Ay = (height1 / 2) + y1;
   double cornerR1Bx = (width1 / 2) + x1;
   double cornerR1By = -(height1 / 2) + y1;
   double cornerR1Cx = -(width1 / 2) + x1; 
   double cornerR1Cy = (height1 / 2) + y1;
   double cornerR1Dx = -(width1 / 2) + x1;
   double cornerR1Dy = -(height1 / 2) + y1;
   
   double cornerR2Ax = (width2 / 2) + x2; 
   double cornerR2Ay = (height2 / 2) + y2;
   double cornerR2Bx = (width2 / 2) + x2;
   double cornerR2By = -(height2 / 2) + y2;
   double cornerR2Cx = -(width2 / 2) + x2; 
   double cornerR2Cy = (height2 / 2) + y2;
   double cornerR2Dx = -(width2/ 2) + x2;
   double cornerR2Dy = -(height2 / 2) + y2;  
   
   if (x1 > (width1 / 2) + x
      
   System.out.print(cornerR1Ax + " " + cornerR1Ay + " ");  
   System.out.print(cornerR1Bx + " " + cornerR1By + " "); 
   System.out.print(cornerR1Cx + " " + cornerR1Cy + " ");  
   System.out.println(cornerR1Dx + " " + cornerR1Dy + " ");
   
   System.out.print(cornerR2Ax + " " + cornerR2Ay + " ");  
   System.out.print(cornerR2Bx + " " + cornerR2By + " "); 
   System.out.print(cornerR2Cx + " " + cornerR2Cy + " ");  
   System.out.print(cornerR2Dx + " " + cornerR2Dy + " "); 
   }
}