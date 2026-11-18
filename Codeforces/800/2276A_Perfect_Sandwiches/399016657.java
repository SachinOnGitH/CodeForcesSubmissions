// Codeforces: https://codeforces.com/contest/2276/A
// Problem: Perfect Sandwiches
// Submission: https://codeforces.com/contest/2276/submission/399016657
// Language: Java 21
// Submitted: 2026-11-18T08:02:44.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= b) {
                System.out.println(-1);
            } else {
                System.out.println(Math.min(b, a - b));
            }
        }
    }
}
