import java.util.Scanner;;

public class Qfour {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats;
        double speed;
        String brand;

        System.out.print("Enter the brand of the Car: ");
        brand = sc.nextLine();

        System.out.print("Enter the speed of the car: ");
        speed = sc.nextDouble();

        System.out.print("Enter the number of seats of the car: ");
        seats = sc.nextInt();

        Car c = new Car(brand, speed , seats);
        
        c.displayInfo();

        sc.close();
    }
}
