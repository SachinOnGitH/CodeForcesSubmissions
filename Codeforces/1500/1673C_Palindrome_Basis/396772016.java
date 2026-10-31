// Codeforces: https://codeforces.com/contest/1673/C
// Problem: Palindrome Basis
// Submission: https://codeforces.com/contest/1673/submission/396772016
// Language: Java 21
// Submitted: 2026-10-31T07:59:20.000Z
// Rating: 1500

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MOD = 1000000007;
        int MAX = 40000;

        ArrayList<Integer> pal = new ArrayList<>();

        for (int i = 1; i <= MAX; i++) {
            String s = String.valueOf(i);
            String rev = new StringBuilder(s).reverse().toString();

            if (s.equals(rev)) {
                pal.add(i);
            }
        }

        int[] dp = new int[MAX + 1];
        dp[0] = 1;

        for (int p : pal) {
            for (int j = p; j <= MAX; j++) {
                dp[j] = (int) ((dp[j] + (long) dp[j - p]) % MOD);
            }
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }

        sc.close();
    }
}
