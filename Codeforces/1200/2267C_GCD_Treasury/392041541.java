// Codeforces: https://codeforces.com/contest/2267/C
// Problem: GCD Treasury
// Submission: https://codeforces.com/contest/2267/submission/392041541
// Language: Java 21
// Submitted: 2026-09-25T15:35:15.000Z
// Rating: 1200
import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 300000;
    static int[] spf = new int[MAX + 1];

    // Smallest Prime Factor sieve
    static {
        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) {
                spf[i] = i;

                if ((long) i * i <= MAX) {
                    for (int j = i * i; j <= MAX; j += i) {
                        if (spf[j] == 0) {
                            spf[j] = i;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();
            int x = fs.nextInt();

            // Get distinct prime factors of x
            int[] primes = new int[10];
            int primeCount = 0;

            int temp = x;

            while (temp > 1) {
                int p = spf[temp];
                primes[primeCount++] = p;

                while (temp % p == 0) {
                    temp /= p;
                }
            }

            long[] sums = new long[primeCount];

            for (int i = 0; i < n; i++) {

                int a = fs.nextInt();

                // Add this pile to every prime factor of x
                // which divides a
                for (int j = 0; j < primeCount; j++) {
                    if (a % primes[j] == 0) {
                        sums[j] += a;
                    }
                }
            }

            long answer = 0;

            for (int i = 0; i < primeCount; i++) {
                answer = Math.max(answer, sums[i]);
            }

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }


    // Fast input
    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];

        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {

            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0)
                    return -1;
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

            int result = 0;

            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return result * sign;
        }
    }
}
