/*Write a Java program to input a string and check if it 
contains the word "Java". Use the contains() method.*/

import java.util.Scanner;

public class Strings_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter a text: ");
        text = sc.nextLine();

        boolean containsJava = text.contains("Java");

        System.out.println(containsJava);

        sc.close();
    }
}
