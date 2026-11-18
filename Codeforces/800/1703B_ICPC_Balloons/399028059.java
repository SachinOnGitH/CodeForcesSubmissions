// Codeforces: https://codeforces.com/contest/1703/B
// Problem: ICPC Balloons
// Submission: https://codeforces.com/contest/1703/submission/399028059
// Language: Java 21
// Submitted: 2026-11-18T10:12:53.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] seen = new boolean[26];
            int distinct = 0;

            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'A';

                if (!seen[index]) {
                    seen[index] = true;
                    distinct++;
                }
            }

            System.out.println(n + distinct);
        }
    }
}
