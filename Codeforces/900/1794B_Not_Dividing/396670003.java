// Codeforces: https://codeforces.com/contest/1794/B
// Problem: Not Dividing
// Submission: https://codeforces.com/contest/1794/submission/396670003
// Language: Java 21
// Submitted: 2026-10-30T10:22:14.000Z
// Rating: 900

import java.util.Scanner;

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
                if (a[i] == 1) {
                    a[i]++;
                }
            }

            for (int i = 1; i < n; i++) {
                if (a[i] % a[i - 1] == 0) {
                    a[i]++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
