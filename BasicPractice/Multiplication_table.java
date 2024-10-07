/*Print the multiplication table of a number upto 10*/

import java.util.Scanner;

public class Multiplication_table {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number to get its multiplication table: ");
        num = sc.nextInt();

        for(int i=1; i<=10; i++) {

            System.out.println(num + " x " + i + " = " + (num*i) + "\n" );
        }

        sc.close();
    }
}
