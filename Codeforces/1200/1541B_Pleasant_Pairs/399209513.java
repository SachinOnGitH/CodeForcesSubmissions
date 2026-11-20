// Codeforces: https://codeforces.com/contest/1541/B
// Problem: Pleasant Pairs
// Submission: https://codeforces.com/contest/1541/submission/399209513
// Language: Java 21
// Submitted: 2026-11-20T08:42:49.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(st.nextToken());
            long count = 0;
            for (int i = 1; i <= n; i++) {
                long x = a[i];
                for (long y = 1; x * y <= 2L * n; y++) {
                    long j = x * y - i;
                    if (j > i && j <= n && a[(int) j] == y) count++;
                }
            }
            out.append(count).append('\n');
        }
        System.out.print(out);
    }
}
