// Codeforces: https://codeforces.com/contest/2229/D
// Problem: Me When Median Problem
// Submission: https://codeforces.com/contest/2229/submission/398128904
// Language: Java 21
// Submitted: 2026-11-11T12:25:09.000Z
// Rating: 1700
import java.util.*;

public class Main {
    static int n;
    static int[] yanhee;
    static int[] taper;

    static boolean check(long v) {
        int reira = 0;
        int ojaas = 0;
        boolean afterZero = false;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (yanhee[i] >= v) cnt++;
            if (taper[i] >= v) cnt++;

            if (cnt == 0) {
                if (!afterZero) {
                    ojaas++;
                    afterZero = true;
                }
            } else if (cnt == 2) {
                reira++;
                afterZero = false;
            }
        }
        return reira > ojaas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder rack = new StringBuilder();

        while (t-- > 0) {
            n = sc.nextInt();
            yanhee = new int[n];
            taper = new int[n];
            for (int i = 0; i < n; i++) yanhee[i] = sc.nextInt();
            for (int i = 0; i < n; i++) taper[i] = sc.nextInt();

            long ishhim = 0;
            for (int tae = 30; tae >= 0; tae--) {
                if (check(ishhim + (1L << tae))) ishhim += 1L << tae;
            }
            rack.append(ishhim).append('\n');
        }
        System.out.print(rack);
    }
}
