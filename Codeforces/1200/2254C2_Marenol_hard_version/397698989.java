// Codeforces: https://codeforces.com/contest/2254/C2
// Problem: Marenol (hard version)
// Submission: https://codeforces.com/contest/2254/submission/397698989
// Language: Java 21
// Submitted: 2026-11-07T08:23:14.000Z
// Rating: 1200

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            ArrayList<Integer>[] x = new ArrayList[2];
            ArrayList<Integer>[] y = new ArrayList[2];

            for (int i = 0; i < 2; i++) {
                x[i] = new ArrayList<>();
                y[i] = new ArrayList<>();
            }

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    x[i % 2].add(i);
                }

                if (b.charAt(i) == '1') {
                    y[i % 2].add(i);
                }
            }

            long ans = 0;
            boolean possible = true;

            for (int p = 0; p < 2; p++) {
                if (x[p].size() != y[p].size()) {
                    possible = false;
                    break;
                }

                for (int i = 0; i < x[p].size(); i++) {
                    ans += Math.abs(x[p].get(i) - y[p].get(i)) / 2;
                }
            }

            System.out.println(possible ? ans : -1);
        }

        sc.close();
    }
}
