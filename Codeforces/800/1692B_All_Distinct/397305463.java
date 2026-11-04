// Codeforces: https://codeforces.com/contest/1692/B
// Problem: All Distinct
// Submission: https://codeforces.com/contest/1692/submission/397305463
// Language: Java 21
// Submitted: 2026-11-04T07:54:15.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int distinct = set.size();
            int duplicates = n - distinct;

            int ans = distinct - (duplicates % 2);

            System.out.println(ans);
        }

        sc.close();
    }
}
