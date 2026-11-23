// Codeforces: https://codeforces.com/contest/1671/C
// Problem: Dolce Vita
// Submission: https://codeforces.com/contest/1671/submission/399577228
// Language: Java 21
// Submitted: 2026-11-23T07:17:42.000Z
// Rating: 1200
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long prefix = 0;
            long total = 0;
            for (int k = 1; k <= n; k++) {
                prefix += a[k - 1];
                if (prefix > x) break;
                total += (x - prefix) / k + 1;
            }
            System.out.println(total);
        }
    }
}
