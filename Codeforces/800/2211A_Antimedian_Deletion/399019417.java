// Codeforces: https://codeforces.com/contest/2211/A
// Problem: Antimedian Deletion
// Submission: https://codeforces.com/contest/2211/submission/399019417
// Language: Java 21
// Submitted: 2026-11-18T08:38:44.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.print((n == 1 ? 1 : 2) + " ");
            }
            System.out.println();
        }
    }
}
