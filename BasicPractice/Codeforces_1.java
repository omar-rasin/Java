/*You are given an array a1,a2,…,an of positive integers.You can color some elements of the array red, but 
there cannot be two adjacent red elements (i.e., for 1≤i≤n−1, at least one of aiand ai+1 must not be red).

Your score is the maximum value of a red element plus the number of red elements. Find the maximum score you can get.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤500). The description of the test cases follows.

The first line of each test case contains a single integer n
 (1≤n≤100) — the length of the array.

The second line of each test case contains n
 integers a1,a2,…,an
 (1≤ai≤1000) — the given array.

Output
For each test case, output a single integer: the maximum possible score you can get after coloring some elements
red according to the statement.

 */


 import java.util.Scanner;

 public class Codeforces_1 {
 
     public static void main(String[] args) {
 
         int t;
 
         Scanner sc = new Scanner(System.in);
 
         t = sc.nextInt();
 
         for (int test = 0; test < t; test++) {  // Changed the outer loop variable to `test`
 
             int n;
 
             n = sc.nextInt();
 
             int[] numbers = new int[n];
 
             for (int j = 0; j < n; j++) {  // Changed the inner loop variable to `j`
                 numbers[j] = sc.nextInt();
             }
 
             // Calculate the size of `red` array which will store every alternate element
             int size = (n + 1) / 2;
 
             int[] red = new int[size];
 
             int index = 0;
 
             // Fill the `red` array with alternate elements from `numbers` array
             for (int j = 0; j < n; j += 2) {
                 red[index++] = numbers[j];
             }
 
             // Find the highest element in `red`
             int highest = red[0];
 
             for (int j = 1; j < size; j++) {  // Start from `j = 1` as `red[0]` is already considered
                 if (red[j] > highest) {
                     highest = red[j];
                 }
             }
 
             // Find the number of elements present in `red`
             int elementsPresent = red.length;
 
             // Calculate the sum of the highest element and the number of elements in `red`
             int sum = highest + elementsPresent;
 
             // Output the result
             System.out.println(sum);
         }
 
         sc.close();  // Close the scanner to prevent resource leaks
     }
 }
 