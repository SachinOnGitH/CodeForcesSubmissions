// Codeforces: https://codeforces.com/contest/2254/A
// Problem: Riptide
// Submission: https://codeforces.com/contest/2254/submission/397134716
// Language: Java 21
// Submitted: 2026-11-02T14:59:06.000Z
// Rating: 800
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] a = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;

            while (true) {
                if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                    break;
                }

                Arrays.sort(a);
                a[0]++;
                a[2]--;

                ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
