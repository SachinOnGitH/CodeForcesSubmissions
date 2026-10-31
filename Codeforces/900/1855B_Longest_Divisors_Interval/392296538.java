// Codeforces: https://codeforces.com/contest/1855/B
// Problem: Longest Divisors Interval
// Submission: https://codeforces.com/contest/1855/submission/392296538
// Language: Java 21
// Submitted: 2026-09-27T07:15:09.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();

                long ans = 1;
                while (n % ans == 0) {
                    ans++;
                }

                System.out.println(ans - 1);
            }
        }
        sc.close();
    }
}
