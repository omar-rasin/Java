/*Write a Java program to print the sum , multiply, subtract, divide of two integers  */

import java.util.Scanner;


public class Four_operations {
    
    public static void main(String[] args) {
        
        int num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        int sum = num1 + num2;

        int diff = num1 - num2;

        int product = num1 * num2;

        int quotient = num1 / num2;

        System.out.println("The sum is: "+ sum + "\nThe difference is: " + diff + "\nThe product is: " + product + "\nThe quotient is: " + quotient);

        sc.close();
    }
}
