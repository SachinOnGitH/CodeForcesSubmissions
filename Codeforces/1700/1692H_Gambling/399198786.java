// Codeforces: https://codeforces.com/contest/1692/H
// Problem: Gambling
// Submission: https://codeforces.com/contest/1692/submission/399198786
// Language: Java 21
// Submitted: 2026-11-20T06:13:54.000Z
// Rating: 1700
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = nextInt(in);
            int[] x = new int[n + 1];
            for (int i = 1; i <= n; i++) x[i] = nextInt(in);
            Integer[] idx = new Integer[n];
            for (int i = 0; i < n; i++) idx[i] = i + 1;
            Arrays.sort(idx, (p, q) -> x[p] != x[q] ? Integer.compare(x[p], x[q]) : Integer.compare(p, q));

            int bestScore = Integer.MIN_VALUE, bestA = 0, bestL = 0, bestR = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && x[idx[j]] == x[idx[i]]) j++;
                // occurrences idx[i..j-1], ascending positions
                int cur = 0, start = 0;
                int prev = -1;
                for (int k = i; k < j; k++) {
                    int pos = idx[k];
                    if (prev == -1) {
                        cur = 1;
                        start = pos;
                    } else {
                        int gap = pos - prev - 1;
                        if (cur - gap + 1 > 1) {
                            cur = cur - gap + 1;
                        } else {
                            cur = 1;
                            start = pos;
                        }
                    }
                    if (cur > bestScore) {
                        bestScore = cur;
                        bestA = x[pos];
                        bestL = start;
                        bestR = pos;
                    }
                    prev = pos;
                }
                i = j;
            }
            sb.append(bestA).append(' ').append(bestL).append(' ').append(bestR).append('\n');
        }
        System.out.print(sb);
    }
    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0, b;
        do { b = in.read(); } while (b < '0');
        while (b >= '0') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return ret;
    }
}
