// Codeforces: https://codeforces.com/contest/2233/B
// Problem: Different Distances
// Submission: https://codeforces.com/contest/2233/submission/398639923
// Language: Java 21
// Submitted: 2026-11-15T11:00:39.000Z
// Rating: 900

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) sb.append(i).append(" ");
            for (int i = 1; i <= n; i++) sb.append(i).append(" ");

            sb.append(n).append(" ");
            for (int i = 1; i < n; i++) sb.append(i).append(" ");

            for (int i = 1; i <= n; i++) sb.append(i).append(" ");

            System.out.println(sb);
        }
    }
}
