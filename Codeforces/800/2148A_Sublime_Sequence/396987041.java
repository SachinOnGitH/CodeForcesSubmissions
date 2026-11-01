// Codeforces: https://codeforces.com/contest/2148/A
// Problem: Sublime Sequence
// Submission: https://codeforces.com/contest/2148/submission/396987041
// Language: Java 21
// Submitted: 2026-11-01T08:56:36.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(x);
            }
        }

        sc.close();
    }
}
