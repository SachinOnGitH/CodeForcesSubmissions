// Codeforces: https://codeforces.com/contest/2227/B
// Problem: Party Monster
// Submission: https://codeforces.com/contest/2227/submission/399019789
// Language: Java 21
// Submitted: 2026-11-18T08:42:36.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int open = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    open++;
                }
            }
            System.out.println(n % 2 == 0 && open == n / 2 ? "YES" : "NO");
        }
    }
}
