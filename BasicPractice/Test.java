import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        int age;
        String name;
        double CGPA;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your CGPA: ");
        CGPA = sc.nextDouble();

        sc.close();

        System.out.println(age + ", " + name + ", " + CGPA);
    }
}