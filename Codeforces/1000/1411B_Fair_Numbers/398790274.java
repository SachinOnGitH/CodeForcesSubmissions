// Codeforces: https://codeforces.com/contest/1411/B
// Problem: Fair Numbers
// Submission: https://codeforces.com/contest/1411/submission/398790274
// Language: Java 21
// Submitted: 2026-11-16T14:24:24.000Z
// Rating: 1000
import java.util.*;

public class Main {
    static boolean isFair(long x) {
        long y = x;
        while (y > 0) {
            long d = y % 10;
            if (d != 0 && x % d != 0) return false;
            y /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();
            while (!isFair(n)) {
                n++;
            }
            out.append(n).append('\n');
        }
        System.out.print(out);
    }
}
