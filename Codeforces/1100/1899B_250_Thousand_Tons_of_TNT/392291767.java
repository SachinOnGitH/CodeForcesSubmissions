// Codeforces: https://codeforces.com/contest/1899/B
// Problem: 250 Thousand Tons of TNT
// Submission: https://codeforces.com/contest/1899/submission/392291767
// Language: Java 21
// Submitted: 2026-09-27T06:32:09.000Z
// Rating: 1100
import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];
                long[] pref = new long[n + 1];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    pref[i + 1] = pref[i] + a[i];
                }

                long maxDiff = 0;

                for (int k = 1; k <= n; k++) {
                    if (n % k == 0) {
                        long minSum = Long.MAX_VALUE;
                        long maxSum = Long.MIN_VALUE;

                        for (int i = 0; i < n; i += k) {
                            long blockSum = pref[i + k] - pref[i];
                            minSum = Math.min(minSum, blockSum);
                            maxSum = Math.max(maxSum, blockSum);
                        }

                        maxDiff = Math.max(maxDiff, maxSum - minSum);
                    }
                }

                sb.append(maxDiff).append("\n");
            }
            System.out.print(sb);
        } catch (Exception e) {
        }
    }

    static class FastScanner {
        private final InputStream stream;
        private final byte[] buffer = new byte[1024 * 64];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (head >= tail) {
                head = 0;
                try {
                    tail = stream.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    return -1;
                }
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() {
            int c = read();
            while (c <= 32) {
                if (c == -1) throw new InputMismatchException();
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            while (c > 32) {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (c <= 32) {
                if (c == -1) throw new InputMismatchException();
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            while (c > 32) {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sgn;
        }
    }
}
