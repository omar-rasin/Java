/*Write a Java program to take a full sentence as input,
 remove all the spaces using the replace() method, and 
 print the modified string. */

import java.util.Scanner;

public class Strings_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter a text: ");
        text = sc.nextLine();

        String replacedText = text.replace(" ", "");

        System.out.println(replacedText);

        sc.close();
    }
}
