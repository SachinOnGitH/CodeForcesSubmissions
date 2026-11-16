// Codeforces: https://codeforces.com/contest/1876/A
// Problem: Helmets in Night Light
// Submission: https://codeforces.com/contest/1876/submission/398778195
// Language: Java 21
// Submitted: 2026-11-16T12:48:43.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        Random rnd = new Random();

        while (t-- > 0) {
            int n = sc.nextInt();
            long p = sc.nextLong();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            long[] keys = new long[n];
            for (int i = 0; i < n; i++) {
                keys[i] = b[i] * (1L << 20) + a[i];
            }
            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                long tmp = keys[i];
                keys[i] = keys[j];
                keys[j] = tmp;
            }
            Arrays.sort(keys);

            long cost = p;
            long informed = 1;
            for (int i = 0; i < n && informed < n; i++) {
                long cost_i = keys[i] >> 20;
                long share = keys[i] & ((1L << 20) - 1);
                if (cost_i >= p) break;
                long take = Math.min(share, n - informed);
                cost += take * cost_i;
                informed += take;
            }
            cost += (n - informed) * p;

            out.append(cost).append('\n');
        }
        System.out.print(out);
    }
}
