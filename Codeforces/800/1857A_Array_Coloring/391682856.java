// Codeforces: https://codeforces.com/contest/1857/A
// Problem: Array Coloring
// Submission: https://codeforces.com/contest/1857/submission/391682856
// Language: Java 21
// Submitted: 2026-09-22T15:45:32.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int oddCount = 0;
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x % 2 != 0) {
                        oddCount++;
                    }
                }

                if (oddCount % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
