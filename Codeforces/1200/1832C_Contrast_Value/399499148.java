// Codeforces: https://codeforces.com/contest/1832/C
// Problem: Contrast Value
// Submission: https://codeforces.com/contest/1832/submission/399499148
// Language: Java 21
// Submitted: 2026-11-22T14:24:02.000Z
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
            int[] c = new int[n];
            int m = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (m == 0 || c[m - 1] != x) c[m++] = x;
            }
            if (m == 1) {
                sb.append(1).append("\n");
                continue;
            }
            int ans = 2;
            for (int i = 1; i + 1 < m; i++) {
                if ((c[i] > c[i - 1]) == (c[i] > c[i + 1])) ans++;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
