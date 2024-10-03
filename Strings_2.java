/*Create a Java program that takes a string, converts it to
upper case, and prints the number of characters in the
string using the length() method.
*/

import java.util.Scanner;

public class Strings_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String text;
        System.out.print("Enter a text: ");
        text = sc.nextLine();

        String upperText = text.toUpperCase();

        int textLength = upperText.length();

        System.out.println("The text in uppercase is: " + upperText + "\nThe number of characters are: " + textLength);

        sc.close();
    }
}
