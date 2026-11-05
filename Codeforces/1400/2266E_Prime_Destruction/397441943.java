// Codeforces: https://codeforces.com/contest/2266/E
// Problem: Prime Destruction
// Submission: https://codeforces.com/contest/2266/submission/397441943
// Language: Java 21
// Submitted: 2026-11-05T06:46:04.000Z
// Rating: 1400

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
            }

            int[] spf = new int[max + 1];

            for (int i = 2; i <= max; i++) {
                if (spf[i] == 0) {
                    for (int j = i; j <= max; j += i) {
                        if (spf[j] == 0) {
                            spf[j] = i;
                        }
                    }
                }
            }

            long[] dp = new long[max + 1];

            for (int i = k + 1; i <= max; i++) {
                dp[i] = Long.MAX_VALUE;

                int x = i;

                while (x > 1) {
                    int p = spf[x];

                    dp[i] = Math.min(dp[i], 1L + p * dp[i / p]);

                    while (x % p == 0) {
                        x /= p;
                    }
                }
            }

            long ans = 0;

            for (int x : a) {
                ans += dp[x];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
