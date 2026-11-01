// Codeforces: https://codeforces.com/contest/1800/D
// Problem: Remove Two Letters
// Submission: https://codeforces.com/contest/1800/submission/396985958
// Language: Java 21
// Submitted: 2026-11-01T08:46:17.000Z
// Rating: 1200
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = n - 1;

            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    ans--;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
