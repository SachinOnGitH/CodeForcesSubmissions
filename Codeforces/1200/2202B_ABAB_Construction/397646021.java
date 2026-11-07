// Codeforces: https://codeforces.com/contest/2202/B
// Problem: ABAB Construction
// Submission: https://codeforces.com/contest/2202/submission/397646021
// Language: Java 21
// Submitted: 2026-11-06T17:38:30.000Z
// Rating: 1200
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n % 2 == 1) {
                s = "b" + s;
            }

            boolean possible = true;

            for (int i = 1; i < s.length(); i += 2) {
                if (s.charAt(i) != '?' && s.charAt(i) == s.charAt(i - 1)) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
