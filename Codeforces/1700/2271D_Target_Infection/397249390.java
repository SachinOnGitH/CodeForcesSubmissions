// Codeforces: https://codeforces.com/contest/2271/D
// Problem: Target Infection
// Submission: https://codeforces.com/contest/2271/submission/397249390
// Language: Java 21
// Submitted: 2026-11-03T15:08:03.000Z
// Rating: 1700

import java.util.*;

public class Main {

    static long[] l, r, pref;
    static int n;
    static long m;

    static int lowerBound(long[] arr, long x) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    static int upperBound(long[] arr, long x) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    static long f(long s) {
        long e = s + m - 1;

        int i = lowerBound(r, s);
        int j = upperBound(l, e) - 1;

        if (i > j) {
            return 0;
        }

        long ans = pref[j + 1] - pref[i];

        ans -= Math.max(0L, s - l[i]);
        ans -= Math.max(0L, r[j] - e);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextLong();
            long k = sc.nextLong();

            l = new long[n];
            r = new long[n];
            pref = new long[n + 1];

            for (int i = 0; i < n; i++) {
                l[i] = sc.nextLong();
                r[i] = sc.nextLong();

                pref[i + 1] = pref[i] + r[i] - l[i] + 1;
            }

            long mx = -1;
            long pos = 0;

            for (int i = 0; i < n; i++) {
                long cur = f(l[i]);

                if (cur > mx) {
                    mx = cur;
                    pos = l[i];
                }
            }

            if (k > mx) {
                System.out.println(-1);
                continue;
            }

            if (k == mx) {
                System.out.println(pos);
                continue;
            }

            long low = pos;
            long high = 1000000000000001L;

            while (high - low > 1) {
                long mid = low + (high - low) / 2;

                if (f(mid) > k) {
                    low = mid;
                } else {
                    high = mid;
                }
            }

            System.out.println(high);
        }

        sc.close();
    }
}
