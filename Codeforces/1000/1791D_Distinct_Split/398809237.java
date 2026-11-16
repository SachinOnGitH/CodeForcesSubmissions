// Codeforces: https://codeforces.com/contest/1791/D
// Problem: Distinct Split
// Submission: https://codeforces.com/contest/1791/submission/398809237
// Language: Java 21
// Submitted: 2026-11-16T16:56:31.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] pre = new int[n];
            int[] suf = new int[n + 1];
            boolean[] seen = new boolean[26];
            int c = 0;
            for (int i = 0; i < n; i++) {
                int k = s.charAt(i) - 'a';
                if (!seen[k]) {
                    seen[k] = true;
                    c++;
                }
                pre[i] = c;
            }
            seen = new boolean[26];
            c = 0;
            for (int i = n - 1; i >= 0; i--) {
                int k = s.charAt(i) - 'a';
                if (!seen[k]) {
                    seen[k] = true;
                    c++;
                }
                suf[i] = c;
            }
            int ans = 0;
            for (int i = 0; i + 1 < n; i++) {
                ans = Math.max(ans, pre[i] + suf[i + 1]);
            }
            System.out.println(ans);
        }
    }
}
