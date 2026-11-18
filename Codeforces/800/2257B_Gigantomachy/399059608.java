// Codeforces: https://codeforces.com/contest/2257/B
// Problem: Gigantomachy
// Submission: https://codeforces.com/contest/2257/submission/399059608
// Language: Java 21
// Submitted: 2026-11-18T15:17:06.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long a = 0;
            long b = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                if (i == 0) {
                    a = x + n - 1;
                }
            }

            for (int i = 0; i < m; i++) {
                long x = sc.nextLong();
                if (i == 0) {
                    b = x + m - 1;
                }
            }

            System.out.println(b <= a ? 1 : 2);
        }
    }
}
