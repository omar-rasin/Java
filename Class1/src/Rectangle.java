/*Write a Java program with a class Rectangle that has fields length and width.
Add a method calculateArea() that returns the area of the rectangle. 
Create objects for two rectangles and display their areas. */

public class Rectangle {
    
    double length;
    double width;

    public void calculateArea() {

        double area = length*width;

        System.out.println("Area: " + area + "cm^2");
    }
}
