// Codeforces: https://codeforces.com/contest/1620/A
// Problem: Equal or Not Equal
// Submission: https://codeforces.com/contest/1620/submission/397417023
// Language: Java 21
// Submitted: 2026-11-04T21:51:20.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'N') {
                    count++;
                }
            }

            System.out.println(count == 1 ? "NO" : "YES");
        }

        sc.close();
    }
}
