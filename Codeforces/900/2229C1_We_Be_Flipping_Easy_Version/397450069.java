// Codeforces: https://codeforces.com/contest/2229/C1
// Problem: We Be Flipping (Easy Version)
// Submission: https://codeforces.com/contest/2229/submission/397450069
// Language: Java 21
// Submitted: 2026-11-05T08:28:06.000Z
// Rating: 900

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

            ArrayList<Integer> ans = new ArrayList<>();
            boolean flip = false;

            for (int i = n - 1; i >= 0; i--) {
                int current = flip ? -a[i] : a[i];

                if (current > 0) {
                    ans.add(i + 1);
                    flip = !flip;
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
