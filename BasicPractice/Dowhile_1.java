/*Write a program that uses a do-while loop to repeatedly ask the user
 for a number and print it, but stop the loop when the user enters 0. */

import java.util.Scanner;

public class Dowhile_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;

        do {

            System.out.print("Enter a number: ");

            num = sc.nextInt();

            System.out.println("The number is " + num);

        } while (num != 0);

        sc.close();
        
    }
}
