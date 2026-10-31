// Codeforces: https://codeforces.com/contest/2267/B
// Problem: Fashionable Array
// Submission: https://codeforces.com/contest/2267/submission/392026004
// Language: Java 21
// Submitted: 2026-09-25T15:08:23.000Z
// Rating: 800
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

            int num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();

            int[] freq = new int[101];
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                freq[x]++;
                maxFreq = Math.max(maxFreq, freq[x]);
            }

            boolean first = true;

            for (int level = 1; level <= maxFreq; level++) {

                for (int value = 100; value >= 1; value--) {

                    if (freq[value] >= level) {

                        if (!first) {
                            out.append(' ');
                        }

                        out.append(value);
                        first = false;
                    }
                }
            }

            out.append('\n');
        }

        System.out.print(out);
    }
}
