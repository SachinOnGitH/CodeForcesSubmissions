// Codeforces: https://codeforces.com/contest/1744/C
// Problem: Traffic Light
// Submission: https://codeforces.com/contest/1744/submission/398826201
// Language: Java 21
// Submitted: 2026-11-16T20:00:25.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            if (c == 'g') {
                sb.append(0).append("\n");
                continue;
            }
            int nextG = s.indexOf('g') + n;
            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'g') nextG = i;
                else if (s.charAt(i) == c) ans = Math.max(ans, nextG - i);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
