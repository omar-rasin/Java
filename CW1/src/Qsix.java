import java.util.*;

public class Qsix {
    
    public static void main(String[] args) {
        
        int num;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            System.out.println(num);

            
        }while(num!=0);


        sc.close();
    
    }
}
