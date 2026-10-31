// Codeforces: https://codeforces.com/contest/1805/A
// Problem: We Need the Zero
// Submission: https://codeforces.com/contest/1805/submission/391684710
// Language: Java 21
// Submitted: 2026-09-22T16:00:51.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int xorSum = 0;
                for (int i = 0; i < n; i++) {
                    xorSum ^= sc.nextInt();
                }

                if (n % 2 == 1) {
                    System.out.println(xorSum);
                } else {
                    if (xorSum == 0) {
                        System.out.println(0);
                    } else {
                        System.out.println(-1);
                    }
                }
            }
        }
        sc.close();
    }
}
