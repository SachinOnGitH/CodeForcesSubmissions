// Codeforces: https://codeforces.com/contest/1777/A
// Problem: Everybody Likes Good Arrays!
// Submission: https://codeforces.com/contest/1777/submission/391788416
// Language: Java 21
// Submitted: 2026-09-23T14:36:54.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int operations = 0;
                for (int i = 0; i < n - 1; i++) {
                    if ((a[i] % 2) == (a[i + 1] % 2)) {
                        operations++;
                    }
                }
                System.out.println(operations);
            }
        }
        sc.close();
    }
}
