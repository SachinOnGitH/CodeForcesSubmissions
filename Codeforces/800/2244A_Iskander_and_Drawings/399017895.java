// Codeforces: https://codeforces.com/contest/2244/A
// Problem: Iskander and Drawings
// Submission: https://codeforces.com/contest/2244/submission/399017895
// Language: Java 21
// Submitted: 2026-11-18T08:19:24.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }
            System.out.println((max + 1) / 2);
        }
    }
}
