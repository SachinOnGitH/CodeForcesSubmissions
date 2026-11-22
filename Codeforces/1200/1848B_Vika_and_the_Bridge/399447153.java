// Codeforces: https://codeforces.com/contest/1848/B
// Problem: Vika and the Bridge
// Submission: https://codeforces.com/contest/1848/submission/399447153
// Language: Java 21
// Submitted: 2026-11-22T09:06:46.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int t = (int) in.nval;
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            in.nextToken();
            int n = (int) in.nval;
            in.nextToken();
            int k = (int) in.nval;

            int[] last = new int[k + 1];
            int[] best = new int[k + 1];
            int[] second = new int[k + 1];
            boolean[] seen = new boolean[k + 1];

            for (int i = 1; i <= n; i++) {
                in.nextToken();
                int c = (int) in.nval;
                seen[c] = true;
                int gap = i - last[c] - 1;
                if (gap > best[c]) {
                    second[c] = best[c];
                    best[c] = gap;
                } else if (gap > second[c]) {
                    second[c] = gap;
                }
                last[c] = i;
            }

            int answer = Integer.MAX_VALUE;
            for (int c = 1; c <= k; c++) {
                if (!seen[c]) continue;
                int gap = n - last[c];
                int b = best[c];
                int s = second[c];
                if (gap > b) {
                    s = b;
                    b = gap;
                } else if (gap > s) {
                    s = gap;
                }
                int cost = Math.max(b / 2, s);
                answer = Math.min(answer, cost);
            }
            out.append(answer).append('\n');
        }
        System.out.print(out);
    }
}
