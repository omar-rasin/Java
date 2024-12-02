/*Write a program that takes two integers as input and
divides the first by the second. Use exception handling 
to manage ArithmeticException (division by zero).
 */
import java.util.*;

public class Qone {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter another integer: ");
        int num2 = sc.nextInt();

        try {

            int result = num1/num2;

        }catch(ArithmeticException e) {

            System.out.println("Error: Division by Zero");

        }

        sc.close();
    }

    
}
