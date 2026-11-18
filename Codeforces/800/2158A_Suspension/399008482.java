// Codeforces: https://codeforces.com/contest/2158/A
// Problem: Suspension
// Submission: https://codeforces.com/contest/2158/submission/399008482
// Language: Java 21
// Submitted: 2026-11-18T06:15:33.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(Math.min(n, r + y / 2));
        }
    }
}
