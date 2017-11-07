/*Write a program taht displays all the 
numbers from 100 to 200, ten per line, that are 
divisible by five or six, but not both. 
Numbers are separated by exactly one space.*/

public class Exercise511DW {
   public static void main(String [] args) {
      
      //Declare and initialize variables
      int number = 1;
      int row = 1;
      
      //Loop determines and prints required numbers
      while (number < 201) {
         while (number % 5 == 0 || number % 6 == 0){
            if (number % 5 == 0 && number % 6 == 0) 
               break;
            else {
               if (row % 10 == 0){
                  System.out.println(number + " ");
                  row++;
                  number++;
               }
               else 
                  System.out.print(number + " ");
                  row++;
                  number++;
            }
         }
         number++;    
      }
   }
}