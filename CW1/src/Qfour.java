public class Qfour {
    public static void main(String[] args) {
        
        int t1 = 0, t2 = 1 , nextTerm = 0;
        int i;

        System.out.print("The fibonacci sequence is: 0 1 ");

        for(i=0; i<8; i++) {

            nextTerm = t1 + t2;
            System.out.print(nextTerm + " ");

            t1 = t2;
            t2 = nextTerm;
            
        }
    }
}
