import java.util.Scanner;

public class Qeight {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String sentence;
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        String replaced = sentence.replace(" " , "");

        int len_replaced = replaced.length();

        System.out.println("The number of letters exluding whitespaces are: " + len_replaced);
    }
}
