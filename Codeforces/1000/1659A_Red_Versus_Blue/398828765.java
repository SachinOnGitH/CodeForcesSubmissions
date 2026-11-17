// Codeforces: https://codeforces.com/contest/1659/A
// Problem: Red Versus Blue
// Submission: https://codeforces.com/contest/1659/submission/398828765
// Language: Java 21
// Submitted: 2026-11-16T20:42:33.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int g = b + 1;
            int base = r / g;
            int extra = r % g;
            for (int i = 0; i < g; i++) {
                int cnt = base + (i < extra ? 1 : 0);
                for (int j = 0; j < cnt; j++) sb.append('R');
                if (i < b) sb.append('B');
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
