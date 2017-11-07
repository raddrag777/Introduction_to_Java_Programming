/*Write a program that displays 
a random uppercase letter using 
the Math.random() method*/

public class Exercise416 {
   public static void main(String [] args) {
      
      //Generate a random number between 0 and 26
      double num = Math.random() * 26;
      int i = (int)num;
      
      System.out.println(i);
      
      switch (i){
         case 0: System.out.print("A"); break;
         case 1: System.out.print("B"); break;
         case 2: System.out.print("C"); break;
         case 3: System.out.print("D"); break;
         case 4: System.out.print("E"); break;
         case 5: System.out.print("F"); break;
         case 6: System.out.print("G"); break;
         case 7: System.out.print("H"); break;
         case 8: System.out.print("I"); break;
         case 9: System.out.print("J"); break;
         case 10: System.out.print("K"); break;
         case 11: System.out.print("L"); break;
         case 12: System.out.print("M"); break;
         case 13: System.out.print("N"); break;
         case 14: System.out.print("O"); break;
         case 15: System.out.print("P"); break;
         case 16: System.out.print("Q"); break;
         case 17: System.out.print("R"); break;
         case 18: System.out.print("S"); break;
         case 19: System.out.print("T"); break;
         case 20: System.out.print("U"); break;
         case 21: System.out.print("V"); break;
         case 22: System.out.print("W"); break;
         case 23: System.out.print("X"); break;
         case 24: System.out.print("Y"); break;
         case 25: System.out.print("Z"); 
      }
   }
}