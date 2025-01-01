/*Write a Java program to check whether a number is even or odd 
using an if-else statement.*/

import java.util.Scanner;

public class Qone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int integer = sc.nextInt();

        if(integer%2 == 0 ) {

            System.out.println( integer + " is an even number");
        }else {

            System.out.println(integer + " is a odd number");
        }

        sc.close();
    }

}
