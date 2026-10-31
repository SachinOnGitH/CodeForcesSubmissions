// Codeforces: https://codeforces.com/contest/1761/A
// Problem: Two Permutations
// Submission: https://codeforces.com/contest/1761/submission/391679658
// Language: Java 21
// Submitted: 2026-09-22T15:17:03.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == n && b == n) {
                    System.out.println("YES");
                } else if (a + b + 2 <= n) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
