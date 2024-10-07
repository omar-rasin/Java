//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

import java.util.Scanner;

public class Num_checker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1,num2,num3;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.print("Enter the third number: ");
        num3 = sc.nextInt();

        if(num3 == sum) {
            System.out.println("True");
        }else {
            System.out.println("False");

        }

        sc.close();
    }
}
