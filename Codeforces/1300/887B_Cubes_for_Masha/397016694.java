// Codeforces: https://codeforces.com/contest/887/B
// Problem: Cubes for Masha
// Submission: https://codeforces.com/contest/887/submission/397016694
// Language: Java 21
// Submitted: 2026-11-01T13:36:34.000Z
// Rating: 1300
import java.util.*;

public class Main {
    static int n;
    static int[][] a;
    static boolean[] ok = new boolean[1001];

    static void go(int used, int val) {
        ok[val] = true;
        for (int i = 0; i < n; i++) {
            if ((used & (1 << i)) != 0) continue;
            for (int f = 0; f < 6; f++) {
                go(used | (1 << i), val * 10 + a[i][f]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][6];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 6; j++)
                a[i][j] = sc.nextInt();

        go(0, 0);

        int ans = 1;
        while (ans <= 999 && ok[ans]) ans++;
        System.out.println(ans - 1);
    }
}
