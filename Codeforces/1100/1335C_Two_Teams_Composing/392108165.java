// Codeforces: https://codeforces.com/contest/1335/C
// Problem: Two Teams Composing
// Submission: https://codeforces.com/contest/1335/submission/392108165
// Language: Java 21
// Submitted: 2026-09-26T04:32:34.000Z
// Rating: 1100
import java.io.InputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Map<Integer, Integer> freq = new HashMap<>();
                int maxFreq = 0;

                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    freq.put(val, freq.getOrDefault(val, 0) + 1);
                    maxFreq = Math.max(maxFreq, freq.get(val));
                }

                int uniqueCount = freq.size();
                int ans = Math.max(
                    Math.min(uniqueCount - 1, maxFreq), 
                    Math.min(uniqueCount, maxFreq - 1)
                );

                sb.append(ans).append("\n");
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
    }
}
