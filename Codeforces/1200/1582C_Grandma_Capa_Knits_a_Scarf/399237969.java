// Codeforces: https://codeforces.com/contest/1582/C
// Problem: Grandma Capa Knits a Scarf
// Submission: https://codeforces.com/contest/1582/submission/399237969
// Language: Java 21
// Submitted: 2026-11-20T13:30:50.000Z
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
            String s = br.readLine().trim();
            int best = Integer.MAX_VALUE;
            for (char c = 'a'; c <= 'z'; c++) {
                int l = 0, r = n - 1, cnt = 0;
                boolean ok = true;
                while (l < r) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;
                    } else if (s.charAt(l) == c) {
                        l++;
                        cnt++;
                    } else if (s.charAt(r) == c) {
                        r--;
                        cnt++;
                    } else {
                        ok = false;
                        break;
                    }
                }
                if (ok) best = Math.min(best, cnt);
            }
            out.append(best == Integer.MAX_VALUE ? -1 : best).append('\n');
        }
        System.out.print(out);
    }
}
