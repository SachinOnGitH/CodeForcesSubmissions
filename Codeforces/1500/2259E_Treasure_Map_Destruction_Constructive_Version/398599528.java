// Codeforces: https://codeforces.com/contest/2259/E
// Problem: Treasure Map Destruction (Constructive Version)
// Submission: https://codeforces.com/contest/2259/submission/398599528
// Language: Java 21
// Submitted: 2026-11-14T21:16:43.000Z
// Rating: 1500
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int[] diff = new int[n + 2];
            for (int i = 0; i < n; i++) {
                int d = b[i];
                if (d >= 1) {
                    int lo = Math.max(0, i - d + 1);
                    int hi = Math.min(n - 1, i + d - 1);
                    diff[lo]++;
                    diff[hi + 1]--;
                }
            }

            boolean[] treasure = new boolean[n];
            int run = 0;
            boolean any = false;
            for (int i = 0; i < n; i++) {
                run += diff[i];
                treasure[i] = run == 0;
                if (treasure[i]) any = true;
            }

            if (!any) {
                out.append("-1\n");
                continue;
            }

            int INF = Integer.MAX_VALUE / 2;
            int[] dist = new int[n];
            int last = -INF;
            for (int i = 0; i < n; i++) {
                if (treasure[i]) last = i;
                dist[i] = i - last;
            }
            last = INF;
            for (int i = n - 1; i >= 0; i--) {
                if (treasure[i]) last = i;
                dist[i] = Math.min(dist[i], last - i);
            }

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (b[i] != -1 && b[i] != dist[i]) {
                    ok = false;
                    break;
                }
            }

            if (!ok) {
                out.append("-1\n");
            } else {
                for (int i = 0; i < n; i++) {
                    out.append(treasure[i] ? '1' : '0');
                }
                out.append('\n');
            }
        }
        System.out.print(out);
    }
}
