// Codeforces: https://codeforces.com/contest/1610/B
// Problem: Kalindrome Array
// Submission: https://codeforces.com/contest/1610/submission/399036406
// Language: Java 21
// Submitted: 2026-11-18T11:48:56.000Z
// Rating: 1100

import java.util.*;

public class Main {

    static boolean check(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            if (a[l] == a[r]) {
                l++;
                r--;
            } else if (a[l] == x) {
                l++;
            } else if (a[r] == x) {
                r--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int l = 0;
            int r = n - 1;

            while (l < r && a[l] == a[r]) {
                l++;
                r--;
            }

            if (l >= r || check(a, a[l]) || check(a, a[r])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
