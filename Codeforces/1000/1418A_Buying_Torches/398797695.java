// Codeforces: https://codeforces.com/contest/1418/A
// Problem: Buying Torches
// Submission: https://codeforces.com/contest/1418/submission/398797695
// Language: Java 21
// Submitted: 2026-11-16T15:27:57.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long sticksNeeded = k * (y + 1) - 1;
            long stickTrades = (sticksNeeded + x - 2) / (x - 1);
            out.append(stickTrades + k).append('\n');
        }
        System.out.print(out);
    }
}
