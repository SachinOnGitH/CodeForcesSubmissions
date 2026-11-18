// Codeforces: https://codeforces.com/contest/2218/F
// Problem: The 67th Tree Problem
// Submission: https://codeforces.com/contest/2218/submission/399007829
// Language: Java 21
// Submitted: 2026-11-18T06:05:34.000Z
// Rating: 1500
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = x + y;

            if (n % 2 == 0) {
                if (x < 1 || y < x) {
                    out.append("NO\n");
                    continue;
                }
            } else {
                if (y - 1 < x) {
                    out.append("NO\n");
                    continue;
                }
            }

            out.append("YES\n");
            int next = 2;
            int cur = 1;

            if (n % 2 == 0) {
                for (int i = 1; i <= x; i++) {
                    if (i > 1) {
                        int e = next++;
                        out.append(cur).append(' ').append(e).append('\n');
                        cur = e;
                    }
                    int leaf = next++;
                    out.append(cur).append(' ').append(leaf).append('\n');
                }
                for (int i = 0; i < y - x; i++) {
                    int leaf = next++;
                    out.append(1).append(' ').append(leaf).append('\n');
                }
            } else {
                for (int i = 1; i <= x; i++) {
                    int e = next++;
                    out.append(cur).append(' ').append(e).append('\n');
                    cur = e;
                    int leaf = next++;
                    out.append(cur).append(' ').append(leaf).append('\n');
                }
                for (int i = 0; i < y - 1 - x; i++) {
                    int leaf = next++;
                    out.append(1).append(' ').append(leaf).append('\n');
                }
            }
        }
        System.out.print(out);
    }
}
