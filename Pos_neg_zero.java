/*Write a program that takes a number as input and prints whether it is positive, negative, 
or zero using an if-else statement.
 */
import java.util.Scanner;

public class Pos_neg_zero {
    
    public static void main(String[] args) {
        
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        num = sc.nextInt();

        if(num==0) {
            System.out.println("The number is zero");
        }else if(num>0) {
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }

        sc.close();
    }
}
