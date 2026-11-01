// Codeforces: https://codeforces.com/contest/2274/A
// Problem: The Projections of Paco
// Submission: https://codeforces.com/contest/2274/submission/396977729
// Language: Java 21
// Submitted: 2026-11-01T07:20:27.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();

                if (i % 2 == 1) {
                    ans += x;
                } else {
                    ans -= x;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
