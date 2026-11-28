// Codeforces: https://codeforces.com/contest/2106/E
// Problem: Wolf
// Submission: https://codeforces.com/contest/2106/submission/400170466
// Language: Java 21
// Submitted: 2026-11-28T07:20:43.000Z
// Rating: 1800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] p = new int[n + 1];
            int[] where = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
                where[p[i]] = i;
            }
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                int pos = where[k];
                if (pos < l || pos > r) {
                    System.out.println(-1);
                    continue;
                }
                int needS = 0, needL = 0, a = 0, b = 0;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (m == pos) {
                        break;
                    } else if (m < pos) {
                        needS++;
                        if (p[m] > k) a++;
                        l = m + 1;
                    } else {
                        needL++;
                        if (p[m] < k) b++;
                        r = m - 1;
                    }
                }
                if (needS > k - 1 || needL > n - k) {
                    System.out.println(-1);
                } else {
                    System.out.println(2 * Math.max(a, b));
                }
            }
        }
    }
}
