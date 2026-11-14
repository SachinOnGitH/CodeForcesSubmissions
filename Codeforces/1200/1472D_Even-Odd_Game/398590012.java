// Codeforces: https://codeforces.com/contest/1472/D
// Problem: Even-Odd Game
// Submission: https://codeforces.com/contest/1472/submission/398590012
// Language: Java 21
// Submitted: 2026-11-14T18:45:24.000Z
// Rating: 1200
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        Random rnd = new Random();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            Arrays.sort(a);

            long alice = 0;
            long bob = 0;
            int turn = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (turn % 2 == 0) {
                    if (a[i] % 2 == 0) alice += a[i];
                } else {
                    if (a[i] % 2 == 1) bob += a[i];
                }
                turn++;
            }

            if (alice > bob) out.append("Alice\n");
            else if (bob > alice) out.append("Bob\n");
            else out.append("Tie\n");
        }
        System.out.print(out);
    }
}
