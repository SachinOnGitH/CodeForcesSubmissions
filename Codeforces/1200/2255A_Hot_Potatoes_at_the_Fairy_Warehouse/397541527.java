// Codeforces: https://codeforces.com/contest/2255/A
// Problem: Hot Potatoes at the Fairy Warehouse
// Submission: https://codeforces.com/contest/2255/submission/397541527
// Language: Java 21
// Submitted: 2026-11-06T06:31:42.000Z
// Rating: 1200

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int red = 0;
            int blue = 0;

            if (s[0] == '0' && s[2 * n - 1] == '1') {
                red--;
                blue++;
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                if (s[i] == '1' && s[i + 1] == '0') {
                    s[i] = '0';
                    s[i + 1] = '1';
                    i++;
                }
            }

            for (int i = 0; i < 2 * n; i++) {
                if (s[i] == '1') {
                    if (i % 2 == 1) {
                        red++;
                    } else {
                        blue++;
                    }
                }
            }

            System.out.println(red + " " + blue);
        }

        sc.close();
    }
}
