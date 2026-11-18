// Codeforces: https://codeforces.com/contest/2193/A
// Problem: DBMB and the Array
// Submission: https://codeforces.com/contest/2193/submission/399029966
// Language: Java 21
// Submitted: 2026-11-18T10:37:53.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            if (sum <= s && (s - sum) % x == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
