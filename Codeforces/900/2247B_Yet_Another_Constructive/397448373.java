// Codeforces: https://codeforces.com/contest/2247/B
// Problem: Yet Another Constructive
// Submission: https://codeforces.com/contest/2247/submission/397448373
// Language: Java 21
// Submitted: 2026-11-05T08:08:46.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            if (k > m) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

                for (int i = 1; i <= n; i++) {
                    if (i == k) {
                        System.out.print((long) m - k + 1);
                    } else {
                        System.out.print(1);
                    }

                    if (i < n) {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
