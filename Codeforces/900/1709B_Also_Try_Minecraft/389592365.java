// Codeforces: https://codeforces.com/contest/1709/B
// Problem: Also Try Minecraft
// Submission: https://codeforces.com/contest/1709/submission/389592365
// Language: Java 21
// Submitted: 2026-09-05T20:28:11.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] a = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        long[] prefLeftToRight = new long[n + 1];
        for (int i = 1; i < n; i++) {
            long damage = Math.max(0L, a[i] - a[i + 1]);
            prefLeftToRight[i + 1] = prefLeftToRight[i] + damage;
        }

        long[] prefRightToLeft = new long[n + 1];
        for (int i = n; i > 1; i--) {
            long damage = Math.max(0L, a[i] - a[i - 1]);
            prefRightToLeft[i - 1] = prefRightToLeft[i] + damage;
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            if (s <= t) {
                sb.append(prefLeftToRight[t] - prefLeftToRight[s]).append("\n");
            } else {
                sb.append(prefRightToLeft[t] - prefRightToLeft[s]).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
