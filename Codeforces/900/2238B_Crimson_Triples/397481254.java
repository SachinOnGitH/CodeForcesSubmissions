// Codeforces: https://codeforces.com/contest/2238/B
// Problem: Crimson Triples
// Submission: https://codeforces.com/contest/2238/submission/397481254
// Language: Java 21
// Submitted: 2026-11-05T13:55:25.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 0;

            for (int b = 1; b <= n; b++) {
                long count = n / b;
                ans += count * count;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
