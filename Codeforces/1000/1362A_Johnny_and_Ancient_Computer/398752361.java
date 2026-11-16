// Codeforces: https://codeforces.com/contest/1362/A
// Problem: Johnny and Ancient Computer
// Submission: https://codeforces.com/contest/1362/submission/398752361
// Language: Java 21
// Submitted: 2026-11-16T07:57:16.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long big = Math.max(a, b);
            long small = Math.min(a, b);

            if (big % small != 0) {
                out.append(-1).append('\n');
                continue;
            }

            long ratio = big / small;
            if ((ratio & (ratio - 1)) != 0) {
                out.append(-1).append('\n');
                continue;
            }

            int exp = Long.numberOfTrailingZeros(ratio);
            out.append((exp + 2) / 3).append('\n');
        }
        System.out.print(out);
    }
}
