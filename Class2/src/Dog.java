/*Implement a class Dog that has the attributes breed and size. 
Create a method to display the dog's information,and a 
constructor to initialize the attributes. */



public class Dog {
    
    String breed;

    double size;

    Dog(String breed, double size) {

        this.breed = breed;

        this.size = size;


    }

    void displayinfo() {

        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
    }
}
