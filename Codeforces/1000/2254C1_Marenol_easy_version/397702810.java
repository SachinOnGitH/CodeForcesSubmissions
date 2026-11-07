// Codeforces: https://codeforces.com/contest/2254/C1
// Problem: Marenol (easy version)
// Submission: https://codeforces.com/contest/2254/submission/397702810
// Language: Java 21
// Submitted: 2026-11-07T08:59:34.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int evenA = 0, oddA = 0;
            int evenB = 0, oddB = 0;

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    if (i % 2 == 0) evenA++;
                    else oddA++;
                }

                if (b.charAt(i) == '1') {
                    if (i % 2 == 0) evenB++;
                    else oddB++;
                }
            }

            if (evenA == evenB && oddA == oddB) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
