/*Write a program that displays a table of 
powers. Cast floating point numbers
into integers*/

public class Exercise218 {
   public static void main(String [] args) {
      
      //First row: headings
      System.out.println("a      b       pow(a, b)");
      
      //Second-sixth rows: Calculate power and display
      double secondRow = Math.pow(1, 2);
      System.out.println("1      2       " + (int) secondRow);
      double thirdRow = Math.pow(2, 3);
      System.out.println("2      3       " + (int) thirdRow);
      double fourthRow = Math.pow(3, 4);
      System.out.println("3      4       " + (int) fourthRow);
      double fifthRow = Math.pow(4, 5);
      System.out.println("4      5       " + (int) fifthRow);
      double sixthRow = Math.pow(5, 6);
      System.out.println("5      6       " + (int) sixthRow);
   }
}