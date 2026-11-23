// Codeforces: https://codeforces.com/contest/1872/D
// Problem: Plus Minus Permutation
// Submission: https://codeforces.com/contest/1872/submission/399496487
// Language: Java 21
// Submitted: 2026-11-22T13:53:19.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long l = x / gcd(x, y) * y;
            long cx = n / x - n / l;
            long cy = n / y - n / l;
            long ans = cx * (2 * n - cx + 1) / 2 - cy * (cy + 1) / 2;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
