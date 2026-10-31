// Codeforces: https://codeforces.com/contest/1512/A
// Problem: Spy Detected!
// Submission: https://codeforces.com/contest/1512/submission/385171267
// Language: Java 21
// Submitted: 2026-08-01T16:13:13.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }


            int common;
            if (a[0] == a[1]) {
                common = a[0];
            } else if (a[0] == a[2]) {
                common = a[0];
            } else {
                common = a[1];
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != common) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}
