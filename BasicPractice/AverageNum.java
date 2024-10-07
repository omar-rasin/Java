//Program to find the average of x numbers

import java.util.Scanner;

public class AverageNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Find average of how many numbers: ");
        x = sc.nextInt();

        double sum = 0;

        for(int i=1; i<=x; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextInt();
            sum+=num;
        }

        double average = sum / x;

        System.out.println("The average of the numbers is: " + average);

        sc.close();
    }
}
