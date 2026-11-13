// Codeforces: https://codeforces.com/contest/2193/F
// Problem: Pizza Delivery
// Submission: https://codeforces.com/contest/2193/submission/398451255
// Language: Java 21
// Submitted: 2026-11-13T15:48:06.000Z
// Rating: 1600
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long ax = sc.nextLong();
            long ay = sc.nextLong();
            long bx = sc.nextLong();
            long by = sc.nextLong();

            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) x[i] = sc.nextLong();
            for (int i = 0; i < n; i++) y[i] = sc.nextLong();

            Integer[] order = new Integer[n];
            for (int i = 0; i < n; i++) order[i] = i;
            Arrays.sort(order, (p, q) -> Long.compare(x[p], x[q]));

            long topY = ay, topCost = 0;
            long bottomY = ay, bottomCost = 0;

            int i = 0;
            while (i < n) {
                int j = i;
                long low = y[order[i]];
                long high = low;
                while (j < n && x[order[j]] == x[order[i]]) {
                    long cy = y[order[j]];
                    low = Math.min(low, cy);
                    high = Math.max(high, cy);
                    j++;
                }
                long width = high - low;

                long endTop = Math.min(topCost + Math.abs(topY - low),
                                       bottomCost + Math.abs(bottomY - low)) + width;
                long endBottom = Math.min(topCost + Math.abs(topY - high),
                                          bottomCost + Math.abs(bottomY - high)) + width;

                topY = high;
                topCost = endTop;
                bottomY = low;
                bottomCost = endBottom;
                i = j;
            }

            long vertical = Math.min(topCost + Math.abs(topY - by),
                                     bottomCost + Math.abs(bottomY - by));
            out.append(vertical + (bx - ax)).append('\n');
        }
        System.out.print(out);
    }
}
