// Codeforces: https://codeforces.com/contest/1549/B
// Problem: Gregor and the Pawn Game
// Submission: https://codeforces.com/contest/1549/submission/396989270
// Language: Java 21
// Submitted: 2026-11-01T09:19:36.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            char[] enemy = a.toCharArray();
            char[] gregor = b.toCharArray();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                if (gregor[i] == '1') {
                    if (i > 0 && enemy[i - 1] == '1') {
                        enemy[i - 1] = '0';
                        ans++;
                    } else if (enemy[i] == '0') {
                        ans++;
                    } else if (i < n - 1 && enemy[i + 1] == '1') {
                        enemy[i + 1] = '0';
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
