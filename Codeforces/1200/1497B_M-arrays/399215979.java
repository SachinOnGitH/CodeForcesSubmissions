// Codeforces: https://codeforces.com/contest/1497/B
// Problem: M-arrays
// Submission: https://codeforces.com/contest/1497/submission/399215979
// Language: Java 21
// Submitted: 2026-11-20T09:49:34.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            HashMap<Integer, Integer> cnt = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = Integer.parseInt(st.nextToken()) % m;
                cnt.merge(r, 1, Integer::sum);
            }
            long ans = 0;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                int r = e.getKey();
                if (r == 0 || 2L * r == m) {
                    ans++;
                    continue;
                }
                int s = m - r;
                if (r < s || !cnt.containsKey(s)) {
                    int x = e.getValue();
                    int y = cnt.getOrDefault(s, 0);
                    int diff = Math.abs(x - y);
                    ans += diff == 0 ? 1 : diff;
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
