/*Write a program that prompts the user 
to enter a string and displays the number 
of vowels and consonants in the string.*/

import java.util.Scanner;

public class Exercise549 {
   public static void main(String [] args) { 
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      int sLength = s.length();
      
      char ch;//holds character from string
      int x = 0;//increments through string
      int vowels = 0;//counts vowels
      int consonants = 0;//counts consonants
      
      while (sLength > 0) {
      
         ch = Character.toUpperCase(s.charAt(x));//extract character and capitalizes
                  
         if (Character.isLetter(ch)){//weeds out whitespace
            
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
               
                  vowels++;
            }
            else{
            
               consonants++;
            }
            }
         x++;
         sLength--;
      } 
      System.out.println("The number of vowels is " + vowels);
      System.out.println("The number of consonants is " + consonants); 
   }
}

