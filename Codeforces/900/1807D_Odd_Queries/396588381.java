// Codeforces: https://codeforces.com/contest/1807/D
// Problem: Odd Queries
// Submission: https://codeforces.com/contest/1807/submission/396588381
// Language: Java 21
// Submitted: 2026-10-29T16:05:31.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] prefix = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + sc.nextLong();
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                long sum = prefix[n] - (prefix[r] - prefix[l - 1])
                        + k * (r - l + 1);

                System.out.println(sum % 2 == 1 ? "YES" : "NO");
            }
        }

        sc.close();
    }
}
