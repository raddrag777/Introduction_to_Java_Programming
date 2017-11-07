/*Write a program that generates three random 
points on a circle center at(0,0) with radius 
40 and display three antles in a triange 
formed by these three points*/

public class exercise406 {
   public static void main(String [] args) {
      
      final double RADIUS = 40;
      
      //Generate three random angles
      double angle1 = (Math.random() * (2 * Math.PI));
      double angle2 = (Math.random() * (2 * Math.PI));
      double angle3 = (Math.random() * (2 * Math.PI));
      
      //Get X and Y
      double x1 = RADIUS * Math.cos(angle1);
      double y1 = RADIUS * Math.sin(angle1);
      double x2 = RADIUS * Math.cos(angle2);
      double y2 = RADIUS * Math.sin(angle2);
      double x3 = RADIUS * Math.cos(angle3);
      double y3 = RADIUS * Math.sin(angle3);
      
      //Compute the three sides
      double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
         
      //Find three angles
      double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
			/ (-2 * b * c)));
      double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
			/ (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
			/ (-2 * a * b))); 
      
      System.out.print("Angles are: " + Math.round(angleA * 100) / 100.0 + " " +
			Math.round(angleB * 100) / 100.0 + " " +
			Math.round(angleC * 100) / 100.0);	
   }
}