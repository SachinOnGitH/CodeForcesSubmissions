// Codeforces: https://codeforces.com/contest/1765/M
// Problem: Minimum LCM
// Submission: https://codeforces.com/contest/1765/submission/398825401
// Language: Java 21
// Submitted: 2026-11-16T19:47:15.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = sc.nextLong();
            long p = n;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    p = i;
                    break;
                }
            }
            long a = n / p;
            long b = n - a;
            sb.append(a).append(" ").append(b).append("\n");
        }
        System.out.print(sb);
    }
}
