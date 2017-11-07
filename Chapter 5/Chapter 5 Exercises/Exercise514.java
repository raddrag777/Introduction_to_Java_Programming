/*Write a program that prompts the user to 
enter two positive itegers and displays the gcd*/

import java.util.Scanner;

public class Exercise514 {
   public static void main(String [] args) {
   
   //Declare and initialize variables
   
   int n1 = 0;
   int n2 = 0;
   int d = 0;
   int gcd = 0;
   
   //Create scanner and request and acquire two positive ints
   Scanner input = new Scanner(System.in);
   System.out.print("Enter integer 1: "); 
   n1 = input.nextInt();
   System.out.print("Enter integer 2: ");
   n2 = input.nextInt();
   
   //Make sure n1 is the smaller number
   if (n2 < n1){ //swap if true
      int temp = n2;
      n2 = n1;
      n1 = temp;
      
   }
   //Find GCD.
   d = n1;//Sentinel value
   while (d >= 1) {
      
      //The GDC is the first number that both statements are true for
      if (n1 % d == 0 && n2 % d == 0){
         System.out.println("The GDC is " +d);
         break;
      }
      d--;//If either statement is false, decrement d by one
   } 
   } 
}

 