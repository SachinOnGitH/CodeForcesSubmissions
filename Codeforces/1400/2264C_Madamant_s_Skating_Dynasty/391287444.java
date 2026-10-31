// Codeforces: https://codeforces.com/contest/2264/C
// Problem: Madamant's Skating Dynasty
// Submission: https://codeforces.com/contest/2264/submission/391287444
// Language: Java 21
// Submitted: 2026-09-20T05:39:55.000Z
// Rating: 1400
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main13 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer;
    static final int MOD = 998244353;

    static String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = reader.readLine();
            if (line == null) return null;
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    static long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }

    static long modInverse(long n) {
        return power(n, MOD - 2);
    }

    public static void runTestCase() throws IOException {
        int n = nextInt();
        long[] a = new long[n + 1];

        for (int i = 1; i <= n; ++i) {
            a[i] = nextLong();
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Arrays.sort(a, 1, n + 1);

        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; ++i) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long totalTrees = fact[n - 1];

        long[] H = new long[n + 1];
        for (int i = 1; i < n; ++i) {
            long inv = modInverse(n - i);
            H[i] = (H[i - 1] + inv) % MOD;
        }

        long parentSum = 0;
        for (int j = 2; j <= n; ++j) {
            long term = ((a[j] % MOD) * H[j - 1]) % MOD;
            parentSum = (parentSum + term) % MOD;
        }
        parentSum = (parentSum * totalTrees) % MOD;

        long childSum = 0;
        for (int i = 1; i < n; ++i) {
            childSum = (childSum + (a[i] % MOD)) % MOD;
        }
        childSum = (childSum * totalTrees) % MOD;

        long ans = (parentSum - childSum + MOD) % MOD;
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        String tok = nextToken();
        if (tok != null) {
            int testCases = Integer.parseInt(tok);
            while (testCases-- > 0) {
                runTestCase();
            }
        }
    }
}
