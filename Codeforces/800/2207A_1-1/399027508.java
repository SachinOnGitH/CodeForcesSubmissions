// Codeforces: https://codeforces.com/contest/2207/A
// Problem: 1-1
// Submission: https://codeforces.com/contest/2207/submission/399027508
// Language: Java 21
// Submitted: 2026-11-18T10:05:48.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();
            char[] a = s.clone();
            for (int i = 1; i < n - 1; i++) {
                if (a[i - 1] == '1' && a[i + 1] == '1') {
                    a[i] = '1';
                }
            }
            int max = 0;
            for (char c : a) {
                if (c == '1') {
                    max++;
                }
            }
            for (int j = 0; j < 2; j++) {
                for (int i = 1; i < n - 1; i++) {
                    if (a[i - 1] == '1' && a[i + 1] == '1') {
                        a[i] = '0';
                    }
                }
            }
            int min = 0;
            for (char c : a) {
                if (c == '1') {
                    min++;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
