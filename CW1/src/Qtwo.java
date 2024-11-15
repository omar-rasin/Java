import java.util.*;

public class Qtwo {
    
    public static void main(String[] args) {
        
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        num = sc.nextInt();

        if(num==0) {
            System.out.println("The number is zero");
        }else if (num>0) {
            System.out.println("The number is positive");
        }else if(num<0) {
            System.out.println("The number is negative");
        }

        sc.close();
    }
}
