// Codeforces: https://codeforces.com/contest/1514/B
// Problem: AND 0, Sum Big
// Submission: https://codeforces.com/contest/1514/submission/399210861
// Language: Java 21
// Submitted: 2026-11-20T08:57:27.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        long MOD = 1_000_000_007L;
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long result = 1;
            for (int i = 0; i < k; i++) result = result * (n % MOD) % MOD;
            out.append(result).append('\n');
        }
        System.out.print(out);
    }
}
