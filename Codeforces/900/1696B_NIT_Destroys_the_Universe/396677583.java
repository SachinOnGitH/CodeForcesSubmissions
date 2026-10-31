// Codeforces: https://codeforces.com/contest/1696/B
// Problem: NIT Destroys the Universe
// Submission: https://codeforces.com/contest/1696/submission/396677583
// Language: Java 21
// Submitted: 2026-10-30T11:33:11.000Z
// Rating: 900

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int first = -1;
            int last = -1;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] != 0) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }

            if (first == -1) {
                System.out.println(0);
            } else {
                boolean zeroFound = false;

                for (int i = first; i <= last; i++) {
                    if (a[i] == 0) {
                        zeroFound = true;
                        break;
                    }
                }

                System.out.println(zeroFound ? 2 : 1);
            }
        }

        sc.close();
    }
}
