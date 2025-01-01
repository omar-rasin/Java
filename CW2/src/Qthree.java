import java.util.Scanner;

public class Qthree {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1,str2;

        System.out.print("Enter a String: ");
        str1 = sc.nextLine();

        System.out.print("Enter another String: ");
        str2 = sc.nextLine();

        if(str1.equalsIgnoreCase(str2)) {

            System.out.println("Both Strings are equal");

        }else {

            System.out.println("Both Strings are not equal");
        }

        sc.close();
    }
}
