// Codeforces: https://codeforces.com/contest/2180/B
// Problem: Ashmal
// Submission: https://codeforces.com/contest/2180/submission/399029511
// Language: Java 21
// Submitted: 2026-11-18T10:31:21.000Z
// Rating: 800
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                String x = sc.next();
                String front = x + s;
                String back = s + x;
                if (front.compareTo(back) < 0) {
                    s = front;
                } else {
                    s = back;
                }
            }
            System.out.println(s);
        }
    }
}
