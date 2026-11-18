// Codeforces: https://codeforces.com/contest/2228/A
// Problem: Marisa Steals Reimu's Takeout
// Submission: https://codeforces.com/contest/2228/submission/399022383
// Language: Java 21
// Submitted: 2026-11-18T09:15:21.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int zero = 0;
            int one = 0;
            int two = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    zero++;
                } else if (x == 1) {
                    one++;
                } else {
                    two++;
                }
            }
            int ans = zero + Math.min(one, two)
                    + Math.abs(one - two) / 3;
            System.out.println(ans);
        }
    }
}
