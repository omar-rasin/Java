/*Create a program that splits a comma-separated list 
of fruits ("apple,banana,orange") into individual strings 
and prints each one using a for loop.

 */

import java.util.Scanner;

public class Strings_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String fruitList;
        System.out.print("Enter a list of fruits separated by commas: ");
        fruitList = sc.nextLine();

        String[] splittedText = fruitList.split(",");

        for(int i=0 ;i<splittedText.length; i++ ) {
            System.out.println(splittedText[i]);
        }

        sc.close();
    }   
}
