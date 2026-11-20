// Codeforces: https://codeforces.com/contest/1635/C
// Problem: Differential Sorting
// Submission: https://codeforces.com/contest/1635/submission/399255684
// Language: Java 21
// Submitted: 2026-11-20T16:17:48.000Z
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
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            boolean sorted = true;
            for (int i = 0; i + 1 < n; i++) if (a[i] > a[i + 1]) sorted = false;
            if (sorted) {
                out.append("0\n");
                continue;
            }
            if (a[n - 1] < 0 || a[n - 2] > a[n - 1]) {
                out.append("-1\n");
                continue;
            }
            out.append(n - 2).append('\n');
            for (int i = 1; i <= n - 2; i++) {
                out.append(i).append(' ').append(n - 1).append(' ').append(n).append('\n');
            }
        }
        System.out.print(out);
    }
}
