// Codeforces: https://codeforces.com/contest/2247/A
// Problem: Zero Sum
// Submission: https://codeforces.com/contest/2247/submission/399017235
// Language: Java 21
// Submitted: 2026-11-18T08:11:04.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            System.out.println(Math.abs(sum) % 4 == 0 ? "YES" : "NO");
        }
    }
}
