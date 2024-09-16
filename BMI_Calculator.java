public class BMI_Calculator {
    
    public static void main(String[] args) {
        
        String name = "Muhammad Omar Rasin";

        int age = 16;

        double height = 1.852;

        double weight = 90;

        double BMI = weight / (height*height);

        System.out.println("My name is " + name + "\nMy BMI is " + BMI);

    }
}
