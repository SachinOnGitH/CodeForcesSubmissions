// Codeforces: https://codeforces.com/contest/1791/C
// Problem: Prepend and Append
// Submission: https://codeforces.com/contest/1791/submission/391900856
// Language: Java 21
// Submitted: 2026-09-24T16:26:35.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int left = 0;
                int right = n - 1;

                while (left < right && s.charAt(left) != s.charAt(right)) {
                    left++;
                    right--;
                }

                System.out.println(right - left + 1);
            }
        }
        sc.close();
    }
}
