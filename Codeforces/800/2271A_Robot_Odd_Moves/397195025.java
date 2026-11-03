// Codeforces: https://codeforces.com/contest/2271/A
// Problem: Robot Odd Moves
// Submission: https://codeforces.com/contest/2271/submission/397195025
// Language: Java 21
// Submitted: 2026-11-03T06:39:29.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b > a + 1) {
                System.out.println(-1);
            } else if (a % 2 == b % 2) {
                System.out.println(a);
            } else {
                System.out.println(a + 1);
            }
        }

        sc.close();
    }
}
