// Codeforces: https://codeforces.com/contest/2261/C
// Problem: I Know About a Million Things
// Submission: https://codeforces.com/contest/2261/submission/397700692
// Language: Java 21
// Submitted: 2026-11-07T08:40:03.000Z
// Rating: 1000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if ((odd == 1 && even == 1) || (odd == 3 && even == 0)) {
                System.out.println("Larpity");
            } else {
                System.out.println("Moggity");
            }
        }

        sc.close();
    }
}
