// Codeforces: https://codeforces.com/contest/1875/A
// Problem: Jellyfish and Undertale
// Submission: https://codeforces.com/contest/1875/submission/392295131
// Language: Java 21
// Submitted: 2026-09-27T07:00:42.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                int n = sc.nextInt();

                long totalTime = b;
                for (int i = 0; i < n; i++) {
                    long x = sc.nextLong();
                    totalTime += Math.min(a - 1, x);
                }

                System.out.println(totalTime);
            }
        }
        sc.close();
    }
}
