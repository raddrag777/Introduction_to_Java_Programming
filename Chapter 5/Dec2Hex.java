import java.util.Scanner;

public class Dec2Hex {
   public static void main(String [] args) {
      //Create a scanner
      Scanner input = new Scanner(System.in);
      
      //Prompt user to enter a decimal integer
      System.out.print("Enter a deimal number: ");
      int decimal = input.nextInt();
      
      //Convert a decimal value to a hex digit
      String hex = "";
      while (decimal != 0) {
         int hexValue = decimal % 16;
         
         char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
            (char) (hexValue + '0') : (char)(hexValue - 10 + 'A');
            
            hex = hexDigit + hex;
            decimal = decimal / 16;
      }
      
      System.out.println("The hex number is " + hex);
   }
}