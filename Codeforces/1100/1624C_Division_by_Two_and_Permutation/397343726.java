// Codeforces: https://codeforces.com/contest/1624/C
// Problem: Division by Two and Permutation
// Submission: https://codeforces.com/contest/1624/submission/397343726
// Language: Java 21
// Submitted: 2026-11-04T14:22:01.000Z
// Rating: 1100

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Integer[] a = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a, Collections.reverseOrder());

            boolean[] used = new boolean[n + 1];
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                int x = a[i];

                while (x > 0 && (x > n || used[x])) {
                    x /= 2;
                }

                if (x == 0) {
                    possible = false;
                    break;
                }

                used[x] = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
