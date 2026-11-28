// Codeforces: https://codeforces.com/contest/2045/A
// Problem: Scrambled Scrabble
// Submission: https://codeforces.com/contest/2045/submission/400192206
// Language: Java 21
// Submitted: 2026-11-28T11:11:01.000Z
// Rating: 1700
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int V = 0, y = 0, cons = 0, cntN = 0, cntG = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                V++;
            } else if (c == 'Y') {
                y++;
            } else {
                cons++;
                if (c == 'N') cntN++;
                if (c == 'G') cntG++;
            }
        }
        int best = 0;
        for (int j = 0; j <= Math.min(cntN, cntG); j++) {
            int F = cons - 2 * j + j;
            int s = 0;
            for (int t = 1; t <= n / 3; t++) {
                int need = Math.max(0, t - V) + Math.max(0, 2 * t - F);
                if (need <= y) s = t;
            }
            if (s > 0) {
                best = Math.max(best, 3 * s + Math.min(j, 2 * s));
            }
        }
        System.out.println(best);
    }
}
