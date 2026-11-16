// Codeforces: https://codeforces.com/contest/1859/B
// Problem: Olya and Game with Arrays
// Submission: https://codeforces.com/contest/1859/submission/398779607
// Language: Java 21
// Submitted: 2026-11-16T13:01:34.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sumSecond = 0;
            long globalMin = Long.MAX_VALUE;
            long smallestSecond = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long first = Long.MAX_VALUE;
                long second = Long.MAX_VALUE;
                for (int j = 0; j < m; j++) {
                    long x = sc.nextLong();
                    if (x < first) {
                        second = first;
                        first = x;
                    } else if (x < second) {
                        second = x;
                    }
                }
                sumSecond += second;
                globalMin = Math.min(globalMin, first);
                smallestSecond = Math.min(smallestSecond, second);
            }

            out.append(sumSecond - smallestSecond + globalMin).append('\n');
        }
        System.out.print(out);
    }
}
