// Codeforces: https://codeforces.com/contest/2254/B
// Problem: Evanescent
// Submission: https://codeforces.com/contest/2254/submission/397447645
// Language: Java 21
// Submitted: 2026-11-05T07:59:09.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    ans++;
                }
            }

            int best = 0;

            for (int i = 1; i < n - 1; i++) {
                char a = s.charAt(i - 1);
                char b = s.charAt(i);
                char c = s.charAt(i + 1);

                if (a == c && a != b) {
                    best = Math.min(best, -2);
                } else if (a != b && b != c && a != c) {
                    best = Math.min(best, -1);
                }
            }

            System.out.println(ans + best);
        }

        sc.close();
    }
}
