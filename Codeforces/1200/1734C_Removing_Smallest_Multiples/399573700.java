// Codeforces: https://codeforces.com/contest/1734/C
// Problem: Removing Smallest Multiples
// Submission: https://codeforces.com/contest/1734/submission/399573700
// Language: Java 21
// Submitted: 2026-11-23T06:23:29.000Z
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
            String s = br.readLine().trim();
            boolean[] done = new boolean[n + 1];
            long ans = 0;
            for (int d = 1; d <= n; d++) {
                for (int j = d; j <= n; j += d) {
                    if (s.charAt(j - 1) == '1') break;
                    if (!done[j]) {
                        done[j] = true;
                        ans += d;
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
