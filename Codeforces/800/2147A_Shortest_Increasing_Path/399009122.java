// Codeforces: https://codeforces.com/contest/2147/A
// Problem: Shortest Increasing Path
// Submission: https://codeforces.com/contest/2147/submission/399009122
// Language: Java 21
// Submitted: 2026-11-18T06:25:32.000Z
// Rating: 800
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (x < y) {
                out.append(2).append('\n');
            } else if (y >= 2 && x >= y + 2) {
                out.append(3).append('\n');
            } else {
                out.append(-1).append('\n');
            }
        }
        System.out.print(out);
    }
}
