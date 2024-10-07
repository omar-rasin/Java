/*Create a Student class with fields name and marks. Write a method 
isPassed() that returns true if the marks are greater than 50, and false otherwise.
Instantiate a student object in the main method and check if the student has passed. */

public class Student {
    
    String name;
    double marks;

    public boolean isPassed() {

        if(marks >50) {
            return true;
        }else return false;
    }

}
