// Codeforces: https://codeforces.com/contest/2039/B
// Problem: Shohag Loves Strings
// Submission: https://codeforces.com/contest/2039/submission/398096905
// Language: Java 21
// Submitted: 2026-11-11T05:59:27.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            boolean found = false;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    System.out.println(s.substring(i, i + 2));
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int i = 0; i < n - 2; i++) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                char c = s.charAt(i + 2);

                if (a != b && b != c && a != c) {
                    System.out.println(s.substring(i, i + 3));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
