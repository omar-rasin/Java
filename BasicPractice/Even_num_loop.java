/*Write a program that prints all even numbers between 1 and 20 using a for loop. */


public class Even_num_loop {
    
    public static void main(String[] args) {
        
        for(int i = 1; i<=20; i++) {

            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
