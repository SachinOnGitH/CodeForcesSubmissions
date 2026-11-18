// Codeforces: https://codeforces.com/contest/2205/A
// Problem: Simons and Making It Beautiful
// Submission: https://codeforces.com/contest/2205/submission/399009483
// Language: Java 21
// Submitted: 2026-11-18T06:30:41.000Z
// Rating: 800

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == n) {
                    int temp = a[0];
                    a[0] = a[i];
                    a[i] = temp;
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}
