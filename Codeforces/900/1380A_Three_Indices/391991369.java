// Codeforces: https://codeforces.com/contest/1380/A
// Problem: Three Indices
// Submission: https://codeforces.com/contest/1380/submission/391991369
// Language: Java 21
// Submitted: 2026-09-25T13:41:59.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n];
                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                }

                int foundIdx = -1;
                for (int j = 1; j < n - 1; j++) {
                    if (p[j - 1] < p[j] && p[j] > p[j + 1]) {
                        foundIdx = j;
                        break;
                    }
                }

                if (foundIdx != -1) {
                    System.out.println("YES");
                    System.out.println(foundIdx + " " + (foundIdx + 1) + " " + (foundIdx + 2));
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
