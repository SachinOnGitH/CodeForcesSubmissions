// Codeforces: https://codeforces.com/contest/1840/C
// Problem: Ski Resort
// Submission: https://codeforces.com/contest/1840/submission/398098629
// Language: Java 21
// Submitted: 2026-11-11T06:28:17.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            long ans = 0;
            int len = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x <= q) {
                    len++;
                } else {
                    if (len >= k) {
                        long count = len - k + 1;
                        ans += count * (count + 1) / 2;
                    }
                    len = 0;
                }
            }

            if (len >= k) {
                long count = len - k + 1;
                ans += count * (count + 1) / 2;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
