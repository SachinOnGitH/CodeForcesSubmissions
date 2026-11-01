// Codeforces: https://codeforces.com/contest/1905/B
// Problem: Begginer's Zelda
// Submission: https://codeforces.com/contest/1905/submission/396973676
// Language: Java 21
// Submitted: 2026-11-01T06:35:44.000Z
// Rating: 1100
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] degree = new int[n + 1];

            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                degree[u]++;
                degree[v]++;
            }

            int leaves = 0;

            for (int i = 1; i <= n; i++) {
                if (degree[i] == 1) {
                    leaves++;
                }
            }

            System.out.println((leaves + 1) / 2);
        }

        sc.close();
    }
}
