// Codeforces: https://codeforces.com/contest/2263/A
// Problem: Min Max Game
// Submission: https://codeforces.com/contest/2263/submission/399051728
// Language: Java 21
// Submitted: 2026-11-18T13:23:54.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            for (int i = 0; i < n; i++) {
                count += sc.nextInt();
            }

            if (count >= n - count) {
                System.out.println("Bessie");
            } else {
                System.out.println("Elsie");
            }
        }
    }
}
