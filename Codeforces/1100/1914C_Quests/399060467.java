// Codeforces: https://codeforces.com/contest/1914/C
// Problem: Quests
// Submission: https://codeforces.com/contest/1914/submission/399060467
// Language: Java 21
// Submitted: 2026-11-18T15:34:10.000Z
// Rating: 1100
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int sum = 0;
            int maxB = 0;
            int ans = 0;
            for (int i = 0; i < Math.min(n, k); i++) {
                sum += a[i];
                maxB = Math.max(maxB, b[i]);
                int current = sum + maxB * (k - i - 1);
                ans = Math.max(ans, current);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
