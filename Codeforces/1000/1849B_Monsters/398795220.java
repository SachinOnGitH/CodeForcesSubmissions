// Codeforces: https://codeforces.com/contest/1849/B
// Problem: Monsters
// Submission: https://codeforces.com/contest/1849/submission/398795220
// Language: Java 21
// Submitted: 2026-11-16T15:06:27.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] keys = new long[n];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int r = a % k;
                if (r == 0) r = k;
                keys[i] = (long) (k - r) * 1_000_000L + i;
            }

            Arrays.sort(keys);

            for (int i = 0; i < n; i++) {
                out.append(keys[i] % 1_000_000L + 1).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}
