// Codeforces: https://codeforces.com/contest/1808/B
// Problem: Playing in a Casino
// Submission: https://codeforces.com/contest/1808/submission/399495076
// Language: Java 21
// Submitted: 2026-11-22T13:37:41.000Z
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
        Random rnd = new Random();
        while (t-- > 0) {
            int n = Integer.parseInt(next());
            int m = Integer.parseInt(next());
            int[][] col = new int[m][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) col[j][i] = Integer.parseInt(next());
            long ans = 0;
            for (int j = 0; j < m; j++) {
                int[] a = col[j];
                for (int i = n - 1; i > 0; i--) {
                    int k = rnd.nextInt(i + 1);
                    int tmp = a[i]; a[i] = a[k]; a[k] = tmp;
                }
                Arrays.sort(a);
                for (int i = 0; i < n; i++) ans += (long) a[i] * (2L * i - (n - 1));
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
