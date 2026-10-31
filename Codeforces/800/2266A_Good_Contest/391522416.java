// Codeforces: https://codeforces.com/contest/2266/A
// Problem: Good Contest
// Submission: https://codeforces.com/contest/2266/submission/391522416
// Language: Java 21
// Submitted: 2026-09-21T16:23:26.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                
                int minSolved = Math.min(a1, Math.min(a2, a3));
                System.out.println(n - minSolved);
            }
        }
        sc.close();
    }
}
