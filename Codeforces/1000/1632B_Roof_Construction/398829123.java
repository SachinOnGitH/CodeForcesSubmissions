// Codeforces: https://codeforces.com/contest/1632/B
// Problem: Roof Construction
// Submission: https://codeforces.com/contest/1632/submission/398829123
// Language: Java 21
// Submitted: 2026-11-16T20:48:27.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = Integer.highestOneBit(n - 1);
            for (int i = k - 1; i >= 0; i--) sb.append(i).append(" ");
            for (int i = k; i < n; i++) sb.append(i).append(i + 1 < n ? " " : "");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
