// Codeforces: https://codeforces.com/contest/1766/A
// Problem: Extremely Round
// Submission: https://codeforces.com/contest/1766/submission/391770277
// Language: Java 21
// Submitted: 2026-09-23T11:58:13.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int digits = s.length();
                int leadingDigit = s.charAt(0) - '0';
                
                int ans = 9 * (digits - 1) + leadingDigit;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
