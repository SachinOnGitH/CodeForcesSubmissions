// Codeforces: https://codeforces.com/contest/1829/B
// Problem: Blank Space
// Submission: https://codeforces.com/contest/1829/submission/391955232
// Language: Java 21
// Submitted: 2026-09-25T07:22:58.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int maxSpace = 0;
                int current = 0;

                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    if (val == 0) {
                        current++;
                        maxSpace = Math.max(maxSpace, current);
                    } else {
                        current = 0;
                    }
                }

                System.out.println(maxSpace);
            }
        }
        sc.close();
    }
}
