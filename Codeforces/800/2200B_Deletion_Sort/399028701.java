// Codeforces: https://codeforces.com/contest/2200/B
// Problem: Deletion Sort
// Submission: https://codeforces.com/contest/2200/submission/399028701
// Language: Java 21
// Submitted: 2026-11-18T10:21:24.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(sorted ? n : 1);
        }
    }
}
