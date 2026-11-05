// Codeforces: https://codeforces.com/contest/2246/B
// Problem: ezraft and Array
// Submission: https://codeforces.com/contest/2246/submission/397448876
// Language: Java 21
// Submitted: 2026-11-05T08:15:55.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println(-1);
                continue;
            }

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            long[] a = new long[n];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;

            long sum = 6;

            for (int i = 3; i < n; i++) {
                a[i] = sum;
                sum *= 2;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
                if (i < n - 1) System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
