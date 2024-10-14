/*You are given two integers a and b(a≤b). Over all possible integer values of c(a≤c≤b), 
find the minimum value of (c−a)+(b−c).

Input
The first line contains t(1≤t≤55) — the number of test cases.

Each test case contains two integers aand b(1≤a≤b≤10).

Output
For each test case, output the minimum possible value of (c−a)+(b−c) on a new line.

 */

import java.util.*;


public class Codeforces2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t;
        t = sc.nextInt();

        for(int i=0; i<t; i++) {

            int a , b;

            a = sc.nextInt();
            b = sc.nextInt();

            //Expression : (c−a)+(b−c) = c-a+b+c = b-a
            //Therefore, without depending on c , we can simply use b-a;

            System.out.println(b-a);
        }

        sc.close();
    }
}
