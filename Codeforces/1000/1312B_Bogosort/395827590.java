// Codeforces: https://codeforces.com/contest/1312/B
// Problem: Bogosort
// Submission: https://codeforces.com/contest/1312/submission/395827590
// Language: Java 21
// Submitted: 2026-10-24T11:02:11.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = null;

        if (!reader.ready()) return;
        String line = reader.readLine();
        if (line == null) return;
        tokenizer = new StringTokenizer(line);
        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String l = reader.readLine();
                if (l == null) break;
                tokenizer = new StringTokenizer(l);
            }
            int n = Integer.parseInt(tokenizer.nextToken());
            
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                while (!tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
                a[i] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(a, (x, y) -> y - x);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(a[i]).append(i == n - 1 ? "" : " ");
            }
            out.println(sb.toString());
        }
        out.flush();
    }
}
