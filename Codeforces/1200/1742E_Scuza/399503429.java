// Codeforces: https://codeforces.com/contest/1742/E
// Problem: Scuza
// Submission: https://codeforces.com/contest/1742/submission/399503429
// Language: Java 21
// Submitted: 2026-11-22T15:12:20.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(next());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(next());
            int q = Integer.parseInt(next());
            long[] pm = new long[n + 1];
            long[] ps = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                long a = Long.parseLong(next());
                pm[i] = Math.max(pm[i - 1], a);
                ps[i] = ps[i - 1] + a;
            }
            while (q-- > 0) {
                long k = Long.parseLong(next());
                int lo = 0, hi = n;
                while (lo < hi) {
                    int mid = (lo + hi + 1) >>> 1;
                    if (pm[mid] <= k) lo = mid;
                    else hi = mid - 1;
                }
                sb.append(ps[lo]).append(q == 0 ? "\n" : " ");
            }
        }
        System.out.print(sb);
    }
}
