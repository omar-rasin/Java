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

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt(); // Length of the array
            int[] numbers = new int[n];

            // Read the elements of the array
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.nextInt();
            }

            // Initialize variables to track maximum score
            int maxScore = 0;

            // Try every element as the first red element
            for (int i = 0; i < n; i++) {
                int score = 0; // Reset score for the current selection
                int count = 0; // Reset count of red elements

                // Start from the current index and skip the next one
                for (int j = i; j < n; j += 2) {
                    score = Math.max(score, numbers[j]); // Get the maximum red element
                    count++; // Increment the count of red elements
                }

                // Calculate total score as max element + count of red elements
                maxScore = Math.max(maxScore, score + count);
            }

            // Output the maximum score for this test case
            System.out.println(maxScore);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

 