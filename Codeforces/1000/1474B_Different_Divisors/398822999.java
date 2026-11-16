// Codeforces: https://codeforces.com/contest/1474/B
// Problem: Different Divisors
// Submission: https://codeforces.com/contest/1474/submission/398822999
// Language: Java 21
// Submitted: 2026-11-16T19:11:06.000Z
// Rating: 1000
import java.util.*;

public class Main {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int next(int x) {
        while (!isPrime(x)) x++;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int p = next(d + 1);
            int q = next(p + d);
            System.out.println((long) p * q);
        }
    }
}
