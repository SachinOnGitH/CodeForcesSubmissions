// Codeforces: https://codeforces.com/contest/2230/A
// Problem: Optimal Purchase
// Submission: https://codeforces.com/contest/2230/submission/399008967
// Language: Java 21
// Submitted: 2026-11-18T06:23:22.000Z
// Rating: 800
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long groups = n / 3;
            long rest = n % 3;

            long cost = groups * Math.min(b, 3 * a);
            if (rest > 0) {
                cost += Math.min(rest * a, b);
            }
            out.append(cost).append('\n');
        }
        System.out.print(out);
    }
}
