/*Program minimize floating point errors*/

public class TestSum {
   public static void main(String [] args) {
      //Initialize sum
      double sum = 0;
      double currentValue = 1.0;
      
      //Add 0.01, 0.02, ..., 0.99 to sum
      for (int count = 0; count < 100; count++){
          sum += currentValue;
          currentValue -= 0.01;
       }
      //Display resuult
      System.out.println("The sum is " + sum);
   }
}