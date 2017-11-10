/* Test program for exercise 601
pentagonal numbers */

public class Exercise601Test {
   /**Main method*/
   public static void main(String[] args) {
      final int NUMBER_OF_PENTAGONALS = 100;
      final int CHARS_PER_LINE = 10;
      
      //Print first 100 pentagonals, 10 per line
      for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
         int pentagonal = Exercise601Method.getPentagonalNumber(i);
         if (i % CHARS_PER_LINE == 0) {
            System.out.println(pentagonal + " ");
         }
         else {
            System.out.print(pentagonal + " ");
         }
      }
   }
}