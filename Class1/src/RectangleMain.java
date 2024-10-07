
public class RectangleMain {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 12.5;
        r1.width = 6.25;

        r2.length = 10;
        r2.width = 5;

        r1.calculateArea();
        r2.calculateArea();
    }
}
