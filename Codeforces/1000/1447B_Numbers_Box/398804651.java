// Codeforces: https://codeforces.com/contest/1447/B
// Problem: Numbers Box
// Submission: https://codeforces.com/contest/1447/submission/398804651
// Language: Java 21
// Submitted: 2026-11-16T16:16:13.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long sum = 0;
            int neg = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n * m; i++) {
                int x = sc.nextInt();
                if (x < 0) neg++;
                int a = Math.abs(x);
                sum += a;
                min = Math.min(min, a);
            }
            if (neg % 2 == 1) sum -= 2L * min;
            System.out.println(sum);
        }
    }
}
