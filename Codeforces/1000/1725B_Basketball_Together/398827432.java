// Codeforces: https://codeforces.com/contest/1725/B
// Problem: Basketball Together
// Submission: https://codeforces.com/contest/1725/submission/398827432
// Language: Java 21
// Submitted: 2026-11-16T20:20:38.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        int l = 0, r = n - 1, ans = 0;
        while (l <= r) {
            long need = d / a[r] + 1;
            if (r - l + 1 >= need) {
                ans++;
                l += need - 1;
                r--;
            } else break;
        }
        System.out.println(ans);
    }
}
