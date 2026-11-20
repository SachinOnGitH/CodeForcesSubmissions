// Codeforces: https://codeforces.com/contest/1504/B
// Problem: Flip the Bits
// Submission: https://codeforces.com/contest/1504/submission/399218203
// Language: Java 21
// Submitted: 2026-11-20T10:13:27.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String a = br.readLine().trim();
            String b = br.readLine().trim();
            int[] bal = new int[n];
            int cur = 0;
            for (int i = 0; i < n; i++) {
                cur += a.charAt(i) == '1' ? 1 : -1;
                bal[i] = cur;
            }
            int flip = 0;
            boolean ok = true;
            for (int i = n - 1; i >= 0; i--) {
                int bit = (a.charAt(i) - '0') ^ flip;
                if (bit != b.charAt(i) - '0') {
                    if (bal[i] != 0) {
                        ok = false;
                        break;
                    }
                    flip ^= 1;
                }
            }
            out.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(out);
    }
}
