// Codeforces: https://codeforces.com/contest/2222/D
// Problem: Permutation Construction
// Submission: https://codeforces.com/contest/2222/submission/399901512
// Language: Java 21
// Submitted: 2026-11-26T12:59:21.000Z
// Rating: 1800
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[] suffix = new long[n];
            suffix[n - 1] = 0;
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + a[i];
            }

            Integer[] order = new Integer[n];
            for (int i = 0; i < n; i++) order[i] = i;
            Arrays.sort(order, (x, y) -> Long.compare(suffix[x], suffix[y]));

            int[] p = new int[n];
            for (int rank = 0; rank < n; rank++) {
                p[order[rank]] = rank + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
    }
}
