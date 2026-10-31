// Codeforces: https://codeforces.com/contest/1850/D
// Problem: Balanced Round
// Submission: https://codeforces.com/contest/1850/submission/394777370
// Language: Java 21
// Submitted: 2026-10-16T06:35:10.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null) break;
                tokenizer = new StringTokenizer(line);
            }
            int n = Integer.parseInt(tokenizer.nextToken());
            long k = Long.parseLong(tokenizer.nextToken());

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
                a[i] = Long.parseLong(tokenizer.nextToken());
            }

            Arrays.sort(a);

            int maxLen = 1;
            int currentLen = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    currentLen++;
                } else {
                    currentLen = 1;
                }
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            }

            output.append(n - maxLen).append("\n");
        }
        System.out.print(output);
    }
}
