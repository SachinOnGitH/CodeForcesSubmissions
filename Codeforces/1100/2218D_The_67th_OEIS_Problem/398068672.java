// Codeforces: https://codeforces.com/contest/2218/D
// Problem: The 67th OEIS Problem
// Submission: https://codeforces.com/contest/2218/submission/398068672
// Language: Java 21
// Submitted: 2026-11-10T18:28:15.000Z
// Rating: 1100
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                long ans = (2L * i - 1) * (2L * i + 1);
                System.out.print(ans + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
