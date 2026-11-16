// Codeforces: https://codeforces.com/contest/1438/B
// Problem: Valerii Against Everyone
// Submission: https://codeforces.com/contest/1438/submission/398800842
// Language: Java 21
// Submitted: 2026-11-16T15:48:44.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> seen = new HashSet<>();
            boolean duplicate = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (!seen.add(x)) {
                    duplicate = true;
                }
            }
            out.append(duplicate ? "YES" : "NO").append('\n');
        }
        System.out.print(out);
    }
}
