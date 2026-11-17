// Codeforces: https://codeforces.com/contest/2266/C
// Problem: AND, OR, Sort!
// Submission: https://codeforces.com/contest/2266/submission/398876641
// Language: Java 21
// Submitted: 2026-11-17T06:09:33.000Z
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
            String s = br.readLine().trim();
            int totalZeros = 0, totalOnes = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') totalZeros++;
                else totalOnes++;
            }
            if (s.charAt(0) == '1') {
                sb.append(totalZeros).append("\n");
                continue;
            }
            if (totalOnes == 0) {
                sb.append(0).append("\n");
                continue;
            }
            int p = s.indexOf('1') + 1;
            int[] pre = new int[n + 1];
            for (int i = 0; i < n; i++) pre[i + 1] = pre[i] + (s.charAt(i) == '1' ? 1 : 0);
            int ans = Integer.MAX_VALUE;
            for (int k = p - 1; k <= n; k++) {
                int ones = pre[k];
                int zeros = (n - k) - (totalOnes - pre[k]);
                ans = Math.min(ans, ones + zeros);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
