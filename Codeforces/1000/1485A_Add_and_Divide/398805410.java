// Codeforces: https://codeforces.com/contest/1485/A
// Problem: Add and Divide
// Submission: https://codeforces.com/contest/1485/submission/398805410
// Language: Java 21
// Submitted: 2026-11-16T16:22:13.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ans = Integer.MAX_VALUE;
            for (int k = 0; k <= 60; k++) {
                long nb = b + k;
                if (nb == 1) continue;
                long x = a;
                int cnt = k;
                while (x > 0) {
                    x /= nb;
                    cnt++;
                }
                ans = Math.min(ans, cnt);
            }
            System.out.println(ans);
        }
    }
}
