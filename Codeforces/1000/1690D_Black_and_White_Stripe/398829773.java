// Codeforces: https://codeforces.com/contest/1690/D
// Problem: Black and White Stripe
// Submission: https://codeforces.com/contest/1690/submission/398829773
// Language: Java 21
// Submitted: 2026-11-16T21:00:53.000Z
// Rating: 1000
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();
            int cur = 0;
            for (int i = 0; i < k; i++) if (s.charAt(i) == 'W') cur++;
            int ans = cur;
            for (int i = k; i < n; i++) {
                if (s.charAt(i) == 'W') cur++;
                if (s.charAt(i - k) == 'W') cur--;
                ans = Math.min(ans, cur);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
