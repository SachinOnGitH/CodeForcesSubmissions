// Codeforces: https://codeforces.com/contest/2249/A
// Problem: Rank Subsequence
// Submission: https://codeforces.com/contest/2249/submission/399042725
// Language: Java 21
// Submitted: 2026-11-18T12:50:17.000Z
// Rating: 1300
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            int[] u = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                u[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            int best = 0;
            for (int m = 1; m <= n; m++) {
                int j = 1;
                for (int i = 0; i < n && j <= m; i++) {
                    boolean leftOk = j < l[i] || j > r[i];
                    int fromRight = m - j + 1;
                    boolean rightOk = fromRight < u[i] || fromRight > v[i];
                    if (leftOk && rightOk) j++;
                }
                if (j == m + 1) best = m;
            }
            out.append(best).append('\n');
        }
        System.out.print(out);
    }
}
