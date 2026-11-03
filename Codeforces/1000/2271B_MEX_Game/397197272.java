// Codeforces: https://codeforces.com/contest/2271/B
// Problem: MEX Game
// Submission: https://codeforces.com/contest/2271/submission/397197272
// Language: Java 21
// Submitted: 2026-11-03T06:51:17.000Z
// Rating: 1000
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            boolean possible = false;

            for (int i = 0; i <= n; i++) {
                if (freq[i] < 2 * k) {
                    possible = (freq[i] == 2 * k - 1);
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
