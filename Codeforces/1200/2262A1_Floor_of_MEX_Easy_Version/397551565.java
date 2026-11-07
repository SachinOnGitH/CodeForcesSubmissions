// Codeforces: https://codeforces.com/contest/2262/A1
// Problem: Floor of MEX (Easy Version)
// Submission: https://codeforces.com/contest/2262/submission/397551565
// Language: Java 21
// Submitted: 2026-11-06T08:40:24.000Z
// Rating: 1200

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] diff = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                long l = (long) a[i] * i;
                long r = (long) (a[i] + 1) * i - 1;

                if (l < n) {
                    diff[(int) l]++;
                    diff[(int) Math.min(n, r + 1)]--;
                }
            }

            ArrayList<Integer> ans = new ArrayList<>();
            int active = 0;

            for (int i = 0; i < n; i++) {
                active += diff[i];

                if (active == 0) {
                    ans.add(i);
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
