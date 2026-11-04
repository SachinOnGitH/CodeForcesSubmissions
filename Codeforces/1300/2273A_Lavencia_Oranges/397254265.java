// Codeforces: https://codeforces.com/contest/2273/A
// Problem: Lavencia Oranges
// Submission: https://codeforces.com/contest/2273/submission/397254265
// Language: Java 21
// Submitted: 2026-11-03T15:53:31.000Z
// Rating: 1300

import java.util.*;

public class Main {
    static long capacity(int x) {
        long sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += (long) i * (x / i);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int low = 1;
            int high = n;

            while (low < high) {
                int mid = (low + high) / 2;

                if (capacity(mid) >= n) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            int x = low;
            int[] freq = new int[x + 1];

            int remaining = n;

            for (int i = x; i >= 2; i--) {
                freq[i] = Math.min(x / i, remaining / i);
                remaining -= freq[i] * i;
            }

            freq[1] = remaining;

            int[] ans = new int[n];
            int idx = 0;
            int bag = 1;

            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < freq[i]; j++) {
                    for (int z = 0; z < i; z++) {
                        ans[idx++] = bag;
                    }
                    bag++;
                }
            }

            out.append(x).append('\n');

            for (int i = 0; i < n; i++) {
                out.append(ans[i]).append(i == n - 1 ? '\n' : ' ');
            }
        }

        System.out.print(out);
        sc.close();
    }
}

