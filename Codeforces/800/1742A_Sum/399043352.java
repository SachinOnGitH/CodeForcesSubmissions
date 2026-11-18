// Codeforces: https://codeforces.com/contest/1742/A
// Problem: Sum
// Submission: https://codeforces.com/contest/1742/submission/399043352
// Language: Java 21
// Submitted: 2026-11-18T12:56:07.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c || a + c == b || b + c == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
