// Codeforces: https://codeforces.com/contest/2257/C
// Problem: Spying on the Beaver
// Submission: https://codeforces.com/contest/2257/submission/397012428
// Language: Java 21
// Submitted: 2026-11-01T12:55:59.000Z
// Rating: 1200
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] parent = new int[n + 1];

            for (int i = 2; i <= n; i++) {
                parent[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int[] a = new int[m];

            int skip = 0;

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 1) {
                    skip = i;
                } else if (a[skip] != 1 && a[i] < a[skip]) {
                    skip = i;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(m - 1);

            for (int i = 0; i < m; i++) {
                if (i != skip) {
                    sb.append(" ").append(a[i]);
                }
            }

            System.out.println(sb);
        }

        sc.close();
    }
}
