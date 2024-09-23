/*Create a Java program that takes an integer input from the user 
using a Scanner object and then prints whether the number is positive, 
negative, or zero. */

import java.util.Scanner;

public class Basic_ifElse {
    
    public static void main(String[] args) {
        

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if (num == 0) {
            System.out.println("The number is 0");
        } else {
            if (num>0) {
                System.out.println("Number is positive");
            }else {
                System.out.println("The number is negative");
            }
        }

        sc.close();

    }
}
