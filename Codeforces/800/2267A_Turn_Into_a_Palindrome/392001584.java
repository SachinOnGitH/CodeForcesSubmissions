// Codeforces: https://codeforces.com/contest/2267/A
// Problem: Turn Into a Palindrome
// Submission: https://codeforces.com/contest/2267/submission/392001584
// Language: Java 21
// Submitted: 2026-09-25T14:39:50.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                char c = sc.next().charAt(0);
                String s = sc.next();

                int ans = 0;
                for (int i = 0; i < n / 2; i++) {
                    char left = s.charAt(i);
                    char right = s.charAt(n - 1 - i);

                    if (left != right) {
                        if (left == c || right == c) {
                            ans += 1;
                        } else {
                            ans += 2;
                        }
                    }
                }

                System.out.println(ans);
            }
        }
        sc.close();
    }
}
