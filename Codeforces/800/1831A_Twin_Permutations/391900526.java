// Codeforces: https://codeforces.com/contest/1831/A
// Problem: Twin Permutations
// Submission: https://codeforces.com/contest/1831/submission/391900526
// Language: Java 21
// Submitted: 2026-09-24T16:23:23.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    System.out.print((n + 1 - a[i]) + (i == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
