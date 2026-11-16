// Codeforces: https://codeforces.com/contest/1155/A
// Problem: Reverse a Substring
// Submission: https://codeforces.com/contest/1155/submission/398744853
// Language: Java 21
// Submitted: 2026-11-16T06:12:32.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i + 1 < n; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2));
                return;
            }
        }
        System.out.println("NO");
    }
}
