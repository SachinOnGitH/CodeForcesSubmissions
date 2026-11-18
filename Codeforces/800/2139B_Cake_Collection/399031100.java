// Codeforces: https://codeforces.com/contest/2139/B
// Problem: Cake Collection
// Submission: https://codeforces.com/contest/2139/submission/399031100
// Language: Java 21
// Submitted: 2026-11-18T10:51:08.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += a[n - 1 - i] * Math.max(0L, m - i);
            }
            System.out.println(ans);
        }
    }
}
