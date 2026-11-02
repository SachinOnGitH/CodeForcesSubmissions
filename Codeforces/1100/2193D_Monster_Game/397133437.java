// Codeforces: https://codeforces.com/contest/2193/D
// Problem: Monster Game
// Submission: https://codeforces.com/contest/2193/submission/397133437
// Language: Java 21
// Submitted: 2026-11-02T14:46:16.000Z
// Rating: 1100
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int t = (int) in.nval;
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            in.nextToken();
            int n = (int) in.nval;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                in.nextToken();
                a[i] = (int) in.nval;
            }

            long[] pre = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                in.nextToken();
                pre[i] = pre[i - 1] + (long) in.nval;
            }

            Random rnd = new Random();
            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            Arrays.sort(a);

            long best = 0;
            for (int i = n - 1; i >= 0; i--) {
                long swords = n - i;
                int lo = 0, hi = n;
                while (lo < hi) {
                    int mid = (lo + hi + 1) / 2;
                    if (pre[mid] <= swords) lo = mid;
                    else hi = mid - 1;
                }
                best = Math.max(best, (long) a[i] * lo);
            }
            out.append(best).append('\n');
        }
        System.out.print(out);
    }
}
