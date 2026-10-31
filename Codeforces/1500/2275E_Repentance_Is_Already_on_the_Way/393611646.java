// Codeforces: https://codeforces.com/contest/2275/E
// Problem: Repentance Is Already on the Way
// Submission: https://codeforces.com/contest/2275/submission/393611646
// Language: Java 21
// Submitted: 2026-10-07T16:36:52.000Z
// Rating: 1500
import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;
            while (c > ' ') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = fs.nextInt();
            }

            long cur = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) cur++;
            }

            for (int i = 1; i < n; i++) {
                if (a[i] == b[i - 1]) cur++;
            }

            long best = cur;

            for (int i = n - 2; i >= 0; i--) {
                if (a[i] == b[i + 1]) cur++;
                if (a[i] == b[i]) cur--;

                best = Math.max(best, cur);
            }

            long answer = 2L * n - 1 + best;
            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}
