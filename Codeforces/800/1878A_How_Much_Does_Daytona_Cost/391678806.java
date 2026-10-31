// Codeforces: https://codeforces.com/contest/1878/A
// Problem: How Much Does Daytona Cost?
// Submission: https://codeforces.com/contest/1878/submission/391678806
// Language: Java 21
// Submitted: 2026-09-22T15:08:59.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x == k) {
                        found = true;
                    }
                }
                
                if (found) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
