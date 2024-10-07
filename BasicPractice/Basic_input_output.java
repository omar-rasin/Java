/* Write a Java program that declares a variable of each 
basic data type (int, double, String) and prints them using 
System.out.println(). */

import java.util.Scanner;

public class Basic_input_output {
    
    public static void main(String[] args) {
        
        String name;
        int age;
        double height;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your height: ");
        height = sc.nextDouble();

        sc.close();

        System.out.println("\n\nYour name is: " + name + "\nYour age is: " + age + "\nYour height is: " + height);



    }
}
