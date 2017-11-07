/*Write a programthat prompts the user 
to enter the number of students and each 
student's name and scaore, and finally displays 
the name of the student with the hightest score.*/

import java.util.Scanner;

public class Exercise508DW {
   public static void main(String [] args) {
      double highest = 0;
      String name = "";
      String highestStudent = "";
       
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int studentNumber = input.nextInt();
      //studentNumber++;
           
      do {
         System.out.print("Enter student name: ");
         name = input.next();
         System.out.print("Enter student score: ");
         double score = input.nextDouble();
         
         if (score > highest) {
            highest = score;
            highestStudent = name;
         }
         studentNumber--;  
      } while(studentNumber > 0);
      
      System.out.print("The student with the highest score is : " + highestStudent);
      
   }
}