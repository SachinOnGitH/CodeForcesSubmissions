// Codeforces: https://codeforces.com/contest/1475/A
// Problem: Odd Divisor
// Submission: https://codeforces.com/contest/1475/submission/392626611
// Language: Java 21
// Submitted: 2026-09-29T15:53:00.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();

                if ((n & (n - 1)) == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
