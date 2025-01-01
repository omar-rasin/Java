import java.io.*;

public class Qfive {
    
    public static void main(String[] args) {
        try{
           
            double result = 5/0;

            System.out.println(result);


        }catch  (ArithmeticException e) {

            e.printStackTrace();
        }
        

      
    }
}
