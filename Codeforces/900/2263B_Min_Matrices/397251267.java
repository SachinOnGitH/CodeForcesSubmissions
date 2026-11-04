// Codeforces: https://codeforces.com/contest/2263/B
// Problem: Min Matrices
// Submission: https://codeforces.com/contest/2263/submission/397251267
// Language: Java 21
// Submitted: 2026-11-03T15:25:14.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int x = k - n + 1;

            if (x < 1 || x > n) {
                System.out.println(-1);
                continue;
            }

            int[][] a = new int[n][n];

            a[0][0] = 1;
            int cur = 2;

            for (int i = 1; i < x; i++) {
                a[0][i] = cur++;
                a[i][0] = cur++;
            }

            for (int i = x; i < n; i++) {
                a[i][i] = cur++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 0) {
                        a[i][j] = cur++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
