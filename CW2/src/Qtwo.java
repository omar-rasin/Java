import java.util.Scanner;

public class Qtwo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle(0);

        System.out.print("Enter the radius of the circle: ");

        double radius = sc.nextDouble();

        c.setRadius(radius);

        System.out.println(c.calculateArea());
    }
}
