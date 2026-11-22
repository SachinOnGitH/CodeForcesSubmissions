// Codeforces: https://codeforces.com/contest/1703/E
// Problem: Mirror Grid
// Submission: https://codeforces.com/contest/1703/submission/399478087
// Language: Java 21
// Submitted: 2026-11-22T11:19:21.000Z
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
            char[][] g = new char[n][];
            for (int i = 0; i < n; i++) g[i] = br.readLine().trim().toCharArray();
            int ans = 0;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int c = (g[i][j] - '0')
                          + (g[j][n - 1 - i] - '0')
                          + (g[n - 1 - i][n - 1 - j] - '0')
                          + (g[n - 1 - j][i] - '0');
                    ans += Math.min(c, 4 - c);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
