// Codeforces: https://codeforces.com/contest/2225/B
// Problem: Alternating String
// Submission: https://codeforces.com/contest/2225/submission/398646272
// Language: Java 21
// Submitted: 2026-11-15T12:11:08.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int count = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }

            System.out.println(count <= 2 ? "YES" : "NO");
        }
    }
}
