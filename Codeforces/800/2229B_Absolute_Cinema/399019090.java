// Codeforces: https://codeforces.com/contest/2229/B
// Problem: Absolute Cinema
// Submission: https://codeforces.com/contest/2229/submission/399019090
// Language: Java 21
// Submitted: 2026-11-18T08:34:38.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            long sum = 0;
            long maxMin = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(a[i], b[i]);
                maxMin = Math.max(maxMin, Math.min(a[i], b[i]));
            }
            System.out.println(sum + maxMin);
        }
    }
}
