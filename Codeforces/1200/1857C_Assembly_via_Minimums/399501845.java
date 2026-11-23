// Codeforces: https://codeforces.com/contest/1857/C
// Problem: Assembly via Minimums
// Submission: https://codeforces.com/contest/1857/submission/399501845
// Language: Java 21
// Submitted: 2026-11-22T14:54:28.000Z
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
            int m = n * (n - 1) / 2;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) b[i] = Integer.parseInt(next());
            for (int i = m - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                int tmp = b[i]; b[i] = b[j]; b[j] = tmp;
            }
            Arrays.sort(b);
            int pos = 0;
            for (int i = n - 1; i >= 1; i--) {
                sb.append(b[pos]).append(" ");
                pos += i;
            }
            sb.append(1000000000).append("\n");
        }
        System.out.print(sb);
    }
}
