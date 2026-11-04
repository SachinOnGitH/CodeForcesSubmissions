// Codeforces: https://codeforces.com/contest/2271/C
// Problem: XOR Problem
// Submission: https://codeforces.com/contest/2271/submission/397198710
// Language: Java 21
// Submitted: 2026-11-03T07:08:30.000Z
// Rating: 1400

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int x = 1;
            while (2 * x <= n) {
                x *= 2;
            }

            int[] p = new int[4 * x];
            int idx = 0;

            for (int i = 0; i < x; i++) {
                p[idx++] = i;
            }

            for (int i = x - 1; i >= 0; i--) {
                p[idx++] = i;
            }

            for (int i = x; i < 2 * x; i++) {
                p[idx++] = i;
            }

            for (int i = 2 * x - 1; i >= x; i--) {
                p[idx++] = i;
            }

            System.out.println(4 * x - 1);

            for (int i = 1; i < 4 * x; i++) {
                System.out.print((p[i] ^ p[i - 1]) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
