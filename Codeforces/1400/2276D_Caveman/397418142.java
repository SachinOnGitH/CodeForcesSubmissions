// Codeforces: https://codeforces.com/contest/2276/D
// Problem: Caveman
// Submission: https://codeforces.com/contest/2276/submission/397418142
// Language: Java 21
// Submitted: 2026-11-04T22:22:38.000Z
// Rating: 1400

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] degree = new int[n];

            for (int i = 0; i < m; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;

                degree[u]++;
                degree[v]++;
            }

            Arrays.sort(degree);

            if (degree[0] == 0) {
                System.out.println("Brain Melt");
            } else if (degree[n - 1] == n - 1 && degree[n - 2] == 1) {
                System.out.println(2);
            } else {
                System.out.println("Many");
            }
        }

        sc.close();
    }
}
