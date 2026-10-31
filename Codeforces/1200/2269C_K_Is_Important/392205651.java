// Codeforces: https://codeforces.com/contest/2269/C
// Problem: K Is Important
// Submission: https://codeforces.com/contest/2269/submission/392205651
// Language: Java 21
// Submitted: 2026-09-26T15:31:12.000Z
// Rating: 1200
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long[] a = new long[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            int operations = n - k + 1;
            int pairs = Math.min(k - 1, operations);

            long ans = 0;

            for (int i = 0; i < pairs; i++) {
                ans += Math.max(a[i], a[n - 1 - i]);
            }

            int middle = operations - pairs;

            for (int i = pairs; i < pairs + middle; i++) {
                ans += a[i];
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
