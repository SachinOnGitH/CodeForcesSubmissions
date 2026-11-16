// Codeforces: https://codeforces.com/contest/2232/B
// Problem: Cake Leveling
// Submission: https://codeforces.com/contest/2232/submission/398640744
// Language: Java 21
// Submitted: 2026-11-15T11:11:27.000Z
// Rating: 900
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long ans = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                sum += sc.nextLong();
                ans = Math.min(ans, sum / i);
                System.out.print(ans + " ");
            }

            System.out.println();
        }
    }
}
