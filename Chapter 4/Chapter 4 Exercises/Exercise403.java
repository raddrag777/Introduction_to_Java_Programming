/*Write a program to extimate the area 
enclosed by four cities*/
public class Exercise403 {
   public static void main(String [] args) {   
   
      //GPS location for four cities 
      double ATLANTAX1 = 33.748995;
      double ATLANTAY1 = -84.387982;
      double ORLANDOX2 = 28.538336;
      double ORLANDOY2 = -81.379237;
      double SAVANNAHX3 = 32.002512;
      double SAVANNAHY3 = -81.153557;
      double CHARLOTTEX4 = 35.2270869;
      double CHARLOTTEY4 = -80.8431267;
      
      //convert degrees to radians for all coordinates
      double x1 = Math.toRadians(ATLANTAX1);
      double y1 = Math.toRadians(ATLANTAY1);
      double x2 = Math.toRadians(ORLANDOX2);
      double y2 = Math.toRadians(ORLANDOY2);
      double x3 = Math.toRadians(SAVANNAHX3);
      double y3 = Math.toRadians(SAVANNAHY3);
      double x4 = Math.toRadians(CHARLOTTEX4);
      double y4 = Math.toRadians(CHARLOTTEY4);
      
      //Compute distances between five pairs of cities
      //to form two triangles
      double RADIUS = 6371.01;
      double a1 = RADIUS * Math.acos((Math.sin(x1)) * Math.sin(x2) 
         + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
      double b1 = RADIUS * Math.acos((Math.sin(x2)) * Math.sin(x3) 
         + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
      double c = RADIUS * Math.acos((Math.sin(x1)) * Math.sin(x3) 
         + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
      double a2 = RADIUS * Math.acos((Math.sin(x1)) * Math.sin(x4) 
         + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
      double b2 = RADIUS * Math.acos((Math.sin(x3)) * Math.sin(x4) 
         + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));

      //Compute area of both triangles
      //Compute s using three sides
      double s1 = (a1 + b1 + c) / 2;
      double s2 = (a2 + b2 + c) / 2;
      
      //Compute area of triangle
      double areaTriangle1 = Math.pow((s1 * (s1 - a1) * (s1 - b1) * (s1- c)), .5);
      double areaTriangle2 = Math.pow((s2 * (s2 - a2) * (s2 - b2) * (s2 - c)), .5);

      //Add two areas and display total estimated area
      double totalArea = areaTriangle1 + areaTriangle2;
      
      System.out.print(totalArea);
   }
}