// Codeforces: https://codeforces.com/contest/1704/B
// Problem: Luke is a Foodie
// Submission: https://codeforces.com/contest/1704/submission/398875605
// Language: Java 21
// Submitted: 2026-11-17T05:52:08.000Z
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
            long x = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(st.nextToken());
                long nmn = Math.min(mn, a);
                long nmx = Math.max(mx, a);
                if (nmx - nmn > 2 * x) {
                    ans++;
                    mn = a;
                    mx = a;
                } else {
                    mn = nmn;
                    mx = nmx;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
