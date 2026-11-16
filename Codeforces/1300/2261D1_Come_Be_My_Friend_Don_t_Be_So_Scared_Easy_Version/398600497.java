// Codeforces: https://codeforces.com/contest/2261/D1
// Problem: Come Be My Friend, Don't Be So Scared (Easy Version)
// Submission: https://codeforces.com/contest/2261/submission/398600497
// Language: Java 21
// Submitted: 2026-11-14T21:38:46.000Z
// Rating: 1300
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 1) {
                out.append(0).append('\n');
                continue;
            }

            int k = (n + 1) / 2;
            out.append(k).append('\n');
            for (int j = 1; j <= k; j++) {
                out.append(j).append(' ').append(j + k - 1).append('\n');
            }
        }
        System.out.print(out);
    }
}
