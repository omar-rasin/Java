/*Create a Student class that has attributes name, rollNumber, 
and marks. Write a method to print the student’s details. Use a 
constructor to initialize the attributes. */


public class Student {
    
    String name;

    int rollNumber;

    double marks;

    Student(String name, int rollNumber, double marks) {

        this.name = name;

        this.rollNumber = rollNumber;

        this. marks = marks;
    }

    void displayinfo() {

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
