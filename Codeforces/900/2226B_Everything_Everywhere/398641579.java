// Codeforces: https://codeforces.com/contest/2226/B
// Problem: Everything Everywhere
// Submission: https://codeforces.com/contest/2226/submission/398641579
// Language: Java 21
// Submitted: 2026-11-15T11:20:43.000Z
// Rating: 900
import java.util.*;
public class Main {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;

            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(a[i] - a[i + 1]) == gcd(a[i], a[i + 1])) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
