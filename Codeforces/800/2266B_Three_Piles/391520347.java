// Codeforces: https://codeforces.com/contest/2266/B
// Problem: Three Piles
// Submission: https://codeforces.com/contest/2266/submission/391520347
// Language: Java 21
// Submitted: 2026-09-21T16:18:20.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                
                long ans = Math.max(b - a, a + c - b);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
