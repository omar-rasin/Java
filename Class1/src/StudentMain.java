
public class StudentMain {
    
    public static void main(String[] args) {
        
        Student s = new Student();

        s.name = "Tom";
        s.marks = 49;

        if(s.isPassed()) {
            System.out.println("Passes");
        }else {
            System.out.println("Failed");
        }
    }
}
