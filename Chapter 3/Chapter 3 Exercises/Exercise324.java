/*Write a program that simulates picking a 
card from a deck of 52 cards. Your program 
should display the rantk and suit of the card.*/

public class Exercise324 { 
   public static void main(String [] args) { 
      
//generate two random numbers 
      int rank = (int)(14 * Math.random());
      int suit = (int)(4 * Math.random());
      
      System.out.print("The card you picked is ");

//Create a switch to assign rank and suit
      switch (rank) {
         case 0: System.out.print("Ace of "); break;
         case 1: System.out.print("Two of "); break;
         case 2: System.out.print("Three of "); break;
         case 3: System.out.print("Four of "); break;
         case 4: System.out.print("Five of "); break; 
         case 5: System.out.print("Six of "); break;
         case 6: System.out.print("Seven of "); break;
         case 7: System.out.print("Eight of "); break;
         case 8: System.out.print("Nine of "); break;
         case 9: System.out.print("Ten of )" ); break;
         case 10: System.out.print("Jack of "); break;
         case 11: System.out.print("Queen of "); break;
         case 12: System.out.print("King of "); break;
         case 13: System.out.print("Ace of ");       
      }
      
      switch (suit) {
         case 0: System.out.print("Clubs"); break;
         case 1: System.out.print("Diamonds"); break;
         case 2: System.out.print("Hearts"); break;
         case 3: System.out.print("Spades"); 
      }
      //System.out.print(rank);
   }
}