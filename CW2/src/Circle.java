public class Circle {
    
   private double radius;

   Circle(double radius) {

        radius = this.radius;
   }

   public void setRadius(double radius) {
       this.radius = radius;
   }

   public double getRadius() {
       return radius;
   }

   public double calculateArea() {

        return 3.1415*radius*radius;
   }
}
