/*Write a program that prints the characters 
in the ASCII character table from !(33) to (176)~. 
Display ten charcacters per line. Characters 
are separated by exactly one space.*/

public class Exercise515DW {
   public static void main(String [] args) {
   
      int row = 1;
      char ch = '!';
      do {
         if (row % 10 ==0) {
            System.out.println(ch + " ");
            ch++;
            row++;
         } 
         else {
            System.out.print(ch + " ");
            ch++; 
            row++;
         }
         
      } while (ch <= '~');  
      
   }
}