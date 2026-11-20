// Codeforces: https://codeforces.com/contest/2065/D
// Problem: Skibidus and Sigma
// Submission: https://codeforces.com/contest/2065/submission/399151903
// Language: Java 21
// Submitted: 2026-11-19T15:21:07.000Z
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
            int m = (int) in.nval;

            long[][] arrays = new long[n][m];
            long[] sums = new long[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    in.nextToken();
                    arrays[i][j] = (long) in.nval;
                    sums[i] += arrays[i][j];
                }
            }

            Integer[] order = new Integer[n];
            for (int i = 0; i < n; i++) order[i] = i;
            Arrays.sort(order, (p, q) -> Long.compare(sums[q], sums[p]));

            long prefix = 0;
            long score = 0;
            for (int idx = 0; idx < n; idx++) {
                long[] row = arrays[order[idx]];
                for (int j = 0; j < m; j++) {
                    prefix += row[j];
                    score += prefix;
                }
            }
            out.append(score).append('\n');
        }
        System.out.print(out);
    }
}
