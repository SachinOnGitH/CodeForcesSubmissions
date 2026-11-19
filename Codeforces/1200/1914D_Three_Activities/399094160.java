// Codeforces: https://codeforces.com/contest/1914/D
// Problem: Three Activities
// Submission: https://codeforces.com/contest/1914/submission/399094160
// Language: Java 21
// Submitted: 2026-11-19T04:34:10.000Z
// Rating: 1200
import java.util.*;
public class Main {
    static int[] getBest3(long[] arr) {
        int[] best = {-1, -1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (best[0] == -1 || arr[i] > arr[best[0]]) {
                best[2] = best[1];
                best[1] = best[0];
                best[0] = i;
            } else if (best[1] == -1 || arr[i] > arr[best[1]]) {
                best[2] = best[1];
                best[1] = i;
            } else if (best[2] == -1 || arr[i] > arr[best[2]]) {
                best[2] = i;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] c = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextLong();
            }
            int[] A = getBest3(a);
            int[] B = getBest3(b);
            int[] C = getBest3(c);
            long ans = 0;
            for (int x : A) {
                for (int y : B) {
                    for (int z : C) {
                        if (x != y && x != z && y != z) {
                            ans = Math.max(ans, a[x] + b[y] + c[z]);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
