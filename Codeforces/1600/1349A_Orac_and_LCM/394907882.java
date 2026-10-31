// Codeforces: https://codeforces.com/contest/1349/A
// Problem: Orac and LCM
// Submission: https://codeforces.com/contest/1349/submission/394907882
// Language: Java 21
// Submitted: 2026-10-17T07:51:19.000Z
// Rating: 1600
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            a[i] = Long.parseLong(tokenizer.nextToken());
        }

        long[] gcdSuffix = new long[n];
        gcdSuffix[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            gcdSuffix[i] = gcd(a[i], gcdSuffix[i + 1]);
        }

        long result = 0;
        for (int i = 0; i < n - 1; i++) {
            long currentLcm = (a[i] * gcdSuffix[i + 1]) / gcd(a[i], gcdSuffix[i + 1]);
            result = gcd(result, currentLcm);
        }

        System.out.println(result);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
