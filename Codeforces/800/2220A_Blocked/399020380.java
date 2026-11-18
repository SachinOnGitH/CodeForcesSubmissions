// Codeforces: https://codeforces.com/contest/2220/A
// Problem: Blocked
// Submission: https://codeforces.com/contest/2220/submission/399020380
// Language: Java 21
// Submitted: 2026-11-18T08:50:23.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    possible = false;
                    break;
                }
            }
            if (!possible) {
                System.out.println(-1);
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
