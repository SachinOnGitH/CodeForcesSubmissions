// Codeforces: https://codeforces.com/contest/1883/C
// Problem: Raspberries
// Submission: https://codeforces.com/contest/1883/submission/398754125
// Language: Java 21
// Submitted: 2026-11-16T08:18:52.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = k;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % k == 0) {
                    ans = 0;
                }

                ans = Math.min(ans, (k - x % k) % k);

                if (x % 2 == 0) {
                    even++;
                }
            }

            if (k == 4 && ans > 0) {
                ans = Math.min(ans, Math.max(0, 2 - even));
            }

            System.out.println(ans);
        }
    }
}
