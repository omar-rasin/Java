import java.util.Scanner;

public class Qseven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1;
        System.out.print("Enter a String: ");
        str1 = sc.nextLine();

        String str2;
        System.out.print("Enter another String: ");
        str2 = sc.nextLine();

        int len_str1 = str1.length();
        int len_str2 = str2.length();

        String concat = str1.concat(str2);

        System.out.println("Length of String 1: " + len_str1 + "\nLength of String 2: " + len_str2 + "\nConcatenated String: " + concat);

        sc.close();
    }
}
