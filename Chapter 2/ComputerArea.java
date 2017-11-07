public class ComputerArea {
   public static void main(String [] args) {
      double radius;
      double area;
      
      //Step 1 read in radius
      radius = 20; //radius is now 20
      
      //Step 2 compute area
      area = radius * radius * 3.14159;
     
      //Step 3 display area
      System.out.println("The area for the circle of radius " + radius + " is " + area);
   }
}