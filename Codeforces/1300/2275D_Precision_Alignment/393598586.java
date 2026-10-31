// Codeforces: https://codeforces.com/contest/2275/D
// Problem: Precision Alignment
// Submission: https://codeforces.com/contest/2275/submission/393598586
// Language: Java 21
// Submitted: 2026-10-07T16:10:45.000Z
// Rating: 1300
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

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = read();
            }

            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }

            return neg ? -res : res;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    static long[] a, b, c, sum;
    static int n;
    static long k;

    static long required(long target) {
        long operations = 0;

        for (int i = 0; i < n; i++) {
            if (target <= sum[i]) {
                continue;
            }

            if (a[i] == b[i] && b[i] == c[i]) {
                return Long.MAX_VALUE;
            }

            long need;

            if (!(a[i] <= b[i] && b[i] <= c[i])) {
                need = target - sum[i];
            } else {
                long stuck = 2L * Math.min(b[i] - a[i], c[i] - b[i]) + 3;
                need = stuck + (target - sum[i] - 1);
            }

            operations += need;

            if (operations > k) {
                return operations;
            }
        }

        return operations;
    }

    static long solve() {
        long low = Long.MAX_VALUE;
        long high = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, sum[i]);

            if (a[i] == b[i] && b[i] == c[i]) {
                high = Math.min(high, sum[i]);
            }
        }

        if (high == Long.MAX_VALUE) {
            high = low + k;
        } else {
            high = Math.min(high, low + k);
        }

        while (low < high) {
            long mid = low + (high - low + 1) / 2;

            if (required(mid) <= k) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            n = fs.nextInt();
            k = fs.nextLong();

            a = new long[n];
            b = new long[n];
            c = new long[n];
            sum = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                b[i] = fs.nextLong();
                c[i] = fs.nextLong();
                sum[i] = a[i] + b[i] + c[i];
            }

            out.append(solve()).append('\n');
        }

        System.out.print(out);
    }
}
