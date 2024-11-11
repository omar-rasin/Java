/*Create a superclass Vehicle with an attribute speed and methods
start() and stop(). Create two subclasses Car and Bike that 
inherit from Vehicle and override the start() and stop() methods.


 */

public class Vehicle {
    
    int speed = 240;

    void start() {

        System.out.println("Vehicle has started");
    }

    void stop() {

        System.out.println("Vehicle has stopped");
    }
}
