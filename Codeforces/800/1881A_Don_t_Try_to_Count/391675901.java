// Codeforces: https://codeforces.com/contest/1881/A
// Problem: Don't Try to Count
// Submission: https://codeforces.com/contest/1881/submission/391675901
// Language: Java 21
// Submitted: 2026-09-22T14:41:30.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                String x = sc.next();
                String s = sc.next();

                int ops = 0;
                boolean found = false;

                while (ops <= 6) {
                    if (x.contains(s)) {
                        found = true;
                        break;
                    }
                    x = x + x;
                    ops++;
                }

                if (found) {
                    System.out.println(ops);
                } else {
                    System.out.println(-1);
                }
            }
        }
        sc.close();
    }
}
