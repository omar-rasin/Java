/*Create a method that throws an IllegalArgumentException if the 
input string is empty. Use throw and throws.
 */
import java.util.*;

public class Qtwo {
    
    
    public static void Str_check() {

        Scanner sc = new Scanner(System.in);

        String str = null;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        if(str == null || str == "") {

            throw new IllegalArgumentException("Error: The inputted String is empty"); 
        }else {

            System.out.println("Valid input String");
        }

        sc.close();

    }

    public static void main(String[] args) {
        
        Str_check();
    }
}
