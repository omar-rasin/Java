/* Modify the "Hello World" program to ask the user for their
 name and print a personalized greeting (e.g., “Hello, Alice!”).*/

import java.util.Scanner;
public class Hello_user {

    public static void main(String[] args) {
        
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Hello " + name + "!");

        sc.close();
    }
}
