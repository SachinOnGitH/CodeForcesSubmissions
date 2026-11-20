// Codeforces: https://codeforces.com/contest/1433/D
// Problem: Districts Connection
// Submission: https://codeforces.com/contest/1433/submission/399216605
// Language: Java 21
// Submitted: 2026-11-20T09:56:24.000Z
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
            int p = -1;
            for (int i = 2; i <= n; i++) {
                if (a[i] != a[1]) {
                    p = i;
                    break;
                }
            }
            if (p == -1) {
                out.append("NO\n");
                continue;
            }
            out.append("YES\n");
            for (int i = 2; i <= n; i++) {
                if (a[i] != a[1]) out.append(1).append(' ').append(i).append('\n');
                else out.append(p).append(' ').append(i).append('\n');
            }
        }
        System.out.print(out);
    }
}
