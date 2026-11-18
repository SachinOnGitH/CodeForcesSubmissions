// Codeforces: https://codeforces.com/contest/2217/C
// Problem: Grid Covering
// Submission: https://codeforces.com/contest/2217/submission/399050969
// Language: Java 21
// Submitted: 2026-11-18T13:16:56.000Z
// Rating: 1300
import java.util.*;

public class Main {
    static long gcd(long x, long y) {
        while (y != 0) {
            long r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long g = gcd(n, m);
            boolean ok = gcd(a, n) == 1 && gcd(b, m) == 1 && (g == 1 || g == 2);
            out.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(out);
    }
}
