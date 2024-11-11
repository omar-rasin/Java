public class Circle extends Shape {
    
    
    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    void area() {

       System.out.println(radius*radius*3.1415);
    }

}
