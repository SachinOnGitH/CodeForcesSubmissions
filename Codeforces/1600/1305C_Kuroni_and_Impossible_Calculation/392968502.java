// Codeforces: https://codeforces.com/contest/1305/C
// Problem: Kuroni and Impossible Calculation
// Submission: https://codeforces.com/contest/1305/submission/392968502
// Language: Java 21
// Submitted: 2026-10-02T14:41:12.000Z
// Rating: 1600
import java.util.Scanner;

public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n > m) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = (ans * Math.abs(a[i] - a[j])) % m;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            solve(sc);
        }
        sc.close();
    }
}
