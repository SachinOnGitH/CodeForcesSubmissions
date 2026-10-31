// Codeforces: https://codeforces.com/contest/1917/B
// Problem: Erase First or Second Letter
// Submission: https://codeforces.com/contest/1917/submission/396796907
// Language: Java 21
// Submitted: 2026-10-31T12:35:01.000Z
// Rating: 1100

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<Character> set = new HashSet<>();
            long ans = 0;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (!set.contains(ch)) {
                    ans += n - i;
                    set.add(ch);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
