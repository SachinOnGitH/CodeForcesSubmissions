// Codeforces: https://codeforces.com/contest/2267/D
// Problem: Backrooms Hill
// Submission: https://codeforces.com/contest/2267/submission/392054099
// Language: Java 21
// Submitted: 2026-09-25T16:03:57.000Z
// Rating: 1400
import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();

            int[] position = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                position[x] = i;
            }


            boolean[] dp = new boolean[2];
            dp[0] = true;

            for (int i = 0; i < n - 1; i++) {

                int value = i + 1;
                int valueParity = position[value] % 2;

                boolean[] next = new boolean[2];

                for (int leftParity = 0; leftParity <= 1; leftParity++) {

                    if (!dp[leftParity]) {
                        continue;
                    }


                    int leftExpected = leftParity;

                    if (valueParity == leftExpected) {
                        next[leftParity ^ 1] = true;
                    }


                    int rightCountParity =
                            (i % 2) ^ leftParity;

                    int rightExpected =
                            ((n - 1) % 2) ^ rightCountParity;

                    if (valueParity == rightExpected) {
                        next[leftParity] = true;
                    }
                }

                dp = next;
            }

            int maxParity = position[n] % 2;

            if (dp[maxParity]) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}
