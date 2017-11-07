/*Write a programthat prompts the user 
to enter the number of students and each 
student's name and scaore, and finally displays 
the name of the student with the hightest score
and the second highest score.*/

import java.util.Scanner;

public class Exercise509 {
   public static void main(String [] args) {
   
   /*String name = "";
      String highestStudent = "";
      String secondHighestStudent = "";
       
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int studentNumber = input.nextInt();
      //studentNumber++;
      
           
      while (studentNumber > 0) {
         System.out.print("Enter student name: ");
         name = input.next();
         System.out.print("Enter student score: ");
         double score = input.nextDouble();
         double highest = score;
         
         if (score > highest) {
            highest = score;
            secondHighestStudent = highestStudent;
            highestStudent = name;
          
          else if (score > highest && secondHighest 
         }
         studentNumber--;  
      }*/
   
   								
			
						}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Last student entered has the highest score 
				secondHigest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Last student entered has the second highest score 
				student2 = name;
				secondHigest = score;
			}
		}

		// Display the student with the hightest score
		// and the student with the second-hightest score.
		System.out.println(
			"Higest scoring student: " + student1 + 
			"\nSecond Higest scoring student: " + student2);
	}
}
      
      