/*Write a Java class Person with attributes name and age.
Create a method to display the details of the person, and 
a constructor to initialize the attributes. */



class Person {
    
    String name;

    int age;

    //Constructor to initialize attributes
    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void displayinfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
