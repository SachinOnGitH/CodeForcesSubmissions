// Codeforces: https://codeforces.com/contest/1614/B
// Problem: Divan and a New Project 
// Submission: https://codeforces.com/contest/1614/submission/398830703
// Language: Java 21
// Submitted: 2026-11-16T21:21:38.000Z
// Rating: 1000
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
            long[][] a = new long[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = Long.parseLong(st.nextToken());
                a[i][1] = i;
            }
            Arrays.sort(a, (x, y) -> Long.compare(y[0], x[0]));
            long[] pos = new long[n];
            long total = 0;
            for (int k = 0; k < n; k++) {
                long d = k / 2 + 1;
                pos[(int) a[k][1]] = (k % 2 == 0) ? d : -d;
                total += 2 * a[k][0] * d;
            }
            sb.append(total).append("\n0");
            for (int i = 0; i < n; i++) sb.append(" ").append(pos[i]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
