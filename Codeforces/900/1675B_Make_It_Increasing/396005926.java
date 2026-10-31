// Codeforces: https://codeforces.com/contest/1675/B
// Problem: Make It Increasing
// Submission: https://codeforces.com/contest/1675/submission/396005926
// Language: Java 21
// Submitted: 2026-10-25T15:23:39.000Z
// Rating: 900
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int ans = 0;
            boolean possible = true;
            for (int i = n - 2; i >= 0; i--) {
                while (a[i] >= a[i + 1] && a[i] > 0) {
                    a[i] /= 2;
                    ans++;
                }
                if (a[i] >= a[i + 1]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
