/*Assume a vehicle plate number 
consists of three uppercase letters 
followed by four digits. Write a 
program to generate a plate number.*/

public class Exercise425 {
   public static void main(String [] args) {
      
      //Generate three random ints in the  
      //uppercase range of unicode (65-90)
      int randomLetter1 = 65 + (int)(Math.random() * 25);
      int randomLetter2 = 65 + (int)(Math.random() * 25);
      int randomLetter3 = 65 + (int)(Math.random() * 25);
                  
      //Convert Unicode to characters and print results
      System.out.print((char)randomLetter1); 
      System.out.print((char)randomLetter2);
      System.out.print((char)randomLetter3);

      //Generate four random digits 0-9 and display output
      int num1 = (int) (1000 + Math.random() * 10000);
      System.out.print(num1);
   }
}