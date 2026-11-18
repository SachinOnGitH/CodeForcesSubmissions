// Codeforces: https://codeforces.com/contest/2209/A
// Problem: Flip Flops
// Submission: https://codeforces.com/contest/2209/submission/399037855
// Language: Java 21
// Submitted: 2026-11-18T12:03:34.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] > c) {
                    break;
                }

                long x = Math.min(k, c - a[i]);
                k -= x;
                c += a[i] + x;
            }

            System.out.println(c);
        }
    }
}
