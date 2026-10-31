// Codeforces: https://codeforces.com/contest/1814/A
// Problem: Coins
// Submission: https://codeforces.com/contest/1814/submission/391899875
// Language: Java 21
// Submitted: 2026-09-24T16:16:59.000Z
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

                if (n % 2 == 0 || (n - k) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
