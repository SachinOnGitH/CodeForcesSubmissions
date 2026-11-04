// Codeforces: https://codeforces.com/contest/2258/B1
// Problem: Carrot Chopdown (Easy Version)
// Submission: https://codeforces.com/contest/2258/submission/397296314
// Language: Java 21
// Submitted: 2026-11-04T05:53:57.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] freq = new int[m + 1];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            int[] suffix = new int[m + 2];

            for (int i = m; i >= 1; i--) {
                suffix[i] = suffix[i + 1] + freq[i];
            }

            int ans = 0;

            for (int x = 1; x <= m; x++) {
                int current = suffix[x];

                if (2 * x <= m) {
                    current += freq[2 * x];
                }

                ans = Math.max(ans, current);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
