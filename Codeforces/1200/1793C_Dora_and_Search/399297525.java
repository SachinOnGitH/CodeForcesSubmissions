// Codeforces: https://codeforces.com/contest/1793/C
// Problem: Dora and Search
// Submission: https://codeforces.com/contest/1793/submission/399297525
// Language: Java 21
// Submitted: 2026-11-21T05:38:43.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
            int l = 0, r = n - 1, mn = 1, mx = n;
            while (l < r) {
                if (a[l] == mn) { l++; mn++; }
                else if (a[l] == mx) { l++; mx--; }
                else if (a[r] == mn) { r--; mn++; }
                else if (a[r] == mx) { r--; mx--; }
                else break;
            }
            if (l < r) sb.append(l + 1).append(" ").append(r + 1).append("\n");
            else sb.append(-1).append("\n");
        }
        System.out.print(sb);
    }
}
