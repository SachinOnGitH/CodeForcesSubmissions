// Codeforces: https://codeforces.com/contest/2269/A
// Problem: SauSaGe Bank
// Submission: https://codeforces.com/contest/2269/submission/392177088
// Language: Java 21
// Submitted: 2026-09-26T14:38:31.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                long k = sc.nextLong();
                long ans = (1L << (n - k + 1)) + 2 * (k - 1);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
