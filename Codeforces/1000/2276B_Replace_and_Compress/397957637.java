// Codeforces: https://codeforces.com/contest/2276/B
// Problem: Replace and Compress
// Submission: https://codeforces.com/contest/2276/submission/397957637
// Language: Java 21
// Submitted: 2026-11-09T16:38:12.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int ans = 1;

            if (s.contains("010") || s.contains("101")) {
                ans++;
            }

            if (s.contains("000") || s.contains("111")) {
                ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
