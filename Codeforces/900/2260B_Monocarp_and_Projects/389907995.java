// Codeforces: https://codeforces.com/contest/2260/B
// Problem: Monocarp and Projects
// Submission: https://codeforces.com/contest/2260/submission/389907995
// Language: Java 21
// Submitted: 2026-09-08T15:07:25.000Z
// Rating: 900
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int tc = 0; tc < t; tc++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();
            long diff = y - x;
            long total = 0;
            long month = 0;
            while (month < k && (x + month) <= diff) {
                total += (y + month) % (x + month);
                month++;
            }
            if (month < k) {
                long remainingMonths = k - month;
                total += remainingMonths * diff;
            }
            System.out.println(total);
        }
        scanner.close();
    }
}
