// Codeforces: https://codeforces.com/contest/2269/B
// Problem: KiaKio and Squared Numbers
// Submission: https://codeforces.com/contest/2269/submission/392185315
// Language: Java 21
// Submitted: 2026-09-26T14:49:03.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Map<Long, Integer> freq = new HashMap<>();

                for (int i = 0; i < n; i++) {
                    long val = sc.nextLong();
                    long key = getCanonicalKey(val);
                    freq.put(key, freq.getOrDefault(key, 0) + 1);
                }

                long totalPairs = 0;
                for (int count : freq.values()) {
                    totalPairs += (long) count * (count - 1) / 2;
                }

                System.out.println(totalPairs);
            }
        }
        sc.close();
    }

    private static long getCanonicalKey(long val) {
        int steps = 0;
        while (val != 1 && val != 4) {
            val = sumOfSquareDigits(val);
            steps++;
        }

        if (val == 1) {
            return -1;
        } else {
            return steps % 8;
        }
    }

    private static long sumOfSquareDigits(long n) {
        long sum = 0;
        while (n > 0) {
            long d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
