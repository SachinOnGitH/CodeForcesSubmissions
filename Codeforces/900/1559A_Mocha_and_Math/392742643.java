// Codeforces: https://codeforces.com/contest/1559/A
// Problem: Mocha and Math
// Submission: https://codeforces.com/contest/1559/submission/392742643
// Language: Java 21
// Submitted: 2026-09-30T16:19:08.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int ans = sc.nextInt();
                for (int i = 1; i < n; i++) {
                    ans &= sc.nextInt();
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
