// Codeforces: https://codeforces.com/contest/2225/A
// Problem: A Number Between Two Others
// Submission: https://codeforces.com/contest/2225/submission/399016964
// Language: Java 21
// Submitted: 2026-11-18T08:07:18.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            System.out.println(y > 2 * x ? "YES" : "NO");
        }
    }
}
