// Codeforces: https://codeforces.com/contest/2218/C
// Problem: The 67th Permutation Problem
// Submission: https://codeforces.com/contest/2218/submission/398519398
// Language: Java 21
// Submitted: 2026-11-14T08:34:27.000Z
// Rating: 800
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                out.append(j + 1).append(' ');
                out.append(n + 1 + 2 * j).append(' ');
                out.append(n + 2 + 2 * j).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out);
    }
}
