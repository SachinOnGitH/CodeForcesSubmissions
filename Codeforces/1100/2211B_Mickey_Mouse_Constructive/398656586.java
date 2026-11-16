// Codeforces: https://codeforces.com/contest/2211/B
// Problem: Mickey Mouse Constructive
// Submission: https://codeforces.com/contest/2211/submission/398656586
// Language: Java 21
// Submitted: 2026-11-15T13:48:10.000Z
// Rating: 1100
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int diff = Math.abs(x - y);
            int ans = 0;

            if (diff == 0) {
                ans = 1;
            } else {
                for (int i = 1; i * i <= diff; i++) {
                    if (diff % i == 0) {
                        ans++;

                        if (i != diff / i) {
                            ans++;
                        }
                    }
                }
            }

            out.append(ans).append('\n');

            for (int i = 0; i < x; i++) {
                out.append("1 ");
            }

            for (int i = 0; i < y; i++) {
                out.append("-1 ");
            }

            out.append('\n');
        }

        System.out.print(out);
        sc.close();
    }
}
