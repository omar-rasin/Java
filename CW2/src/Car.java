public class Car extends Vehicle {
    
    int seats;

    Car(String brand, double speed, int seats) {

        this.brand = brand;

        this.seats = seats;

        this.speed = speed;
    }

    void displayInfo() {

        System.out.println("The brand is: " + brand + "\nThe speed is: " + speed + "\nThe number of seats are: " + seats);
    }
}

