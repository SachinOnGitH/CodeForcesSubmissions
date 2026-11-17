// Codeforces: https://codeforces.com/contest/1715/B
// Problem: Beautiful Array
// Submission: https://codeforces.com/contest/1715/submission/398830274
// Language: Java 21
// Submitted: 2026-11-16T21:12:00.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long lo = k * b;
            long hi = lo + (long) n * (k - 1);
            if (s < lo || s > hi) {
                sb.append("-1\n");
                continue;
            }
            long[] a = new long[n];
            a[0] = lo;
            long rem = s - lo;
            for (int i = 0; i < n; i++) {
                long add = Math.min(rem, k - 1);
                a[i] += add;
                rem -= add;
            }
            for (int i = 0; i < n; i++) sb.append(a[i]).append(i + 1 < n ? " " : "\n");
        }
        System.out.print(sb);
    }
}
