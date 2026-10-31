// Codeforces: https://codeforces.com/contest/1853/A
// Problem: Desorting
// Submission: https://codeforces.com/contest/1853/submission/391953789
// Language: Java 21
// Submitted: 2026-09-25T07:05:27.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                boolean isSorted = true;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    if (i > 0 && a[i] < a[i - 1]) {
                        isSorted = false;
                    }
                }

                if (!isSorted) {
                    System.out.println(0);
                    continue;
                }

                int minDiff = Integer.MAX_VALUE;
                for (int i = 0; i < n - 1; i++) {
                    minDiff = Math.min(minDiff, a[i + 1] - a[i]);
                }

                System.out.println(minDiff / 2 + 1);
            }
        }
        sc.close();
    }
}
