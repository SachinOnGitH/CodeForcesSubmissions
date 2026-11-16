// Codeforces: https://codeforces.com/contest/1506/C
// Problem: Double-ended Strings
// Submission: https://codeforces.com/contest/1506/submission/398824181
// Language: Java 21
// Submitted: 2026-11-16T19:28:29.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int m = b.length();
            int[][] dp = new int[n + 1][m + 1];
            int best = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        best = Math.max(best, dp[i][j]);
                    }
                }
            }
            System.out.println(n + m - 2 * best);
        }
    }
}
