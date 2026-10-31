// Codeforces: https://codeforces.com/contest/1806/A
// Problem: Walking Master
// Submission: https://codeforces.com/contest/1806/submission/391954683
// Language: Java 21
// Submitted: 2026-09-25T07:16:03.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                long d = sc.nextLong();

                if (d < b || (a + d - b) < c) {
                    System.out.println(-1);
                } else {
                    long moves = (d - b) + (a + d - b - c);
                    System.out.println(moves);
                }
            }
        }
        sc.close();
    }
}
