// Codeforces: https://codeforces.com/contest/1909/B
// Problem: Make Almost Equal With Mod
// Submission: https://codeforces.com/contest/1909/submission/399349316
// Language: Java 21
// Submitted: 2026-11-21T14:07:55.000Z
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
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(next());
            for (long k = 2; ; k <<= 1) {
                long v0 = a[0] % k, v1 = -1;
                boolean ok = true;
                for (int i = 1; i < n; i++) {
                    long v = a[i] % k;
                    if (v == v0) continue;
                    if (v1 == -1) v1 = v;
                    else if (v != v1) { ok = false; break; }
                }
                if (ok && v1 != -1) { sb.append(k).append("\n"); break; }
            }
        }
        System.out.print(sb);
    }
}
