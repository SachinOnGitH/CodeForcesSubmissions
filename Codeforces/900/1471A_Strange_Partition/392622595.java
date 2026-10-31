// Codeforces: https://codeforces.com/contest/1471/A
// Problem: Strange Partition
// Submission: https://codeforces.com/contest/1471/submission/392622595
// Language: Java 21
// Submitted: 2026-09-29T15:19:08.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long x = sc.nextLong();

                long totalSum = 0;
                long maxSum = 0;

                for (int i = 0; i < n; i++) {
                    long a = sc.nextLong();
                    totalSum += a;
                    maxSum += (a + x - 1) / x;
                }

                long minSum = (totalSum + x - 1) / x;

                System.out.println(minSum + " " + maxSum);
            }
        }
        sc.close();
    }
}
