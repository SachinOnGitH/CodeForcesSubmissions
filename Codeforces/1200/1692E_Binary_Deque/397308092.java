// Codeforces: https://codeforces.com/contest/1692/E
// Problem: Binary Deque
// Submission: https://codeforces.com/contest/1692/submission/397308092
// Language: Java 21
// Submitted: 2026-11-04T08:22:57.000Z
// Rating: 1200

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] a = new int[n];

            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            if (sum < s) {
                System.out.println(-1);
                continue;
            }

            if (sum == s) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            int current = 0;
            int maxLength = 0;

            for (int right = 0; right < n; right++) {
                current += a[right];

                while (current > s) {
                    current -= a[left];
                    left++;
                }

                if (current == s) {
                    maxLength = Math.max(maxLength, right - left + 1);
                }
            }

            System.out.println(n - maxLength);
        }

        sc.close();
    }
}
