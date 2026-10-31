// Codeforces: https://codeforces.com/contest/1420/B
// Problem: Rock and Lever
// Submission: https://codeforces.com/contest/1420/submission/392954641
// Language: Java 21
// Submitted: 2026-10-02T13:07:20.000Z
// Rating: 1200
import java.util.Scanner;

public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] count = new long[32];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int msb = 31 - Integer.numberOfLeadingZeros(x);
            count[msb]++;
        }

        long ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += count[i] * (count[i] - 1) / 2;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }
}
