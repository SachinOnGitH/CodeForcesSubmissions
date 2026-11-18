// Codeforces: https://codeforces.com/contest/2274/B
// Problem: Prefix
// Submission: https://codeforces.com/contest/2274/submission/399053714
// Language: Java 21
// Submitted: 2026-11-18T13:42:59.000Z
// Rating: 1100

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long first = sc.nextLong();

            long minSum = first;
            long maxSum = first;
            long ans = first;

            for (int i = 1; i < n; i++) {
                long x = sc.nextLong();

                ans = Math.max(ans, Math.max(x + Math.abs(minSum), x + Math.abs(maxSum)));

                minSum = x + Math.min(0L, 2 * minSum);
                maxSum = x + Math.max(0L, 2 * maxSum);
            }

            System.out.println(ans);
        }
    }
}
