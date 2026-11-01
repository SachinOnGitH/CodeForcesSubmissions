// Codeforces: https://codeforces.com/contest/1843/C
// Problem: Sum in Binary Tree
// Submission: https://codeforces.com/contest/1843/submission/396987591
// Language: Java 21
// Submitted: 2026-11-01T09:02:02.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long sum = 0;

            while (n >= 1) {
                sum += n;
                n /= 2;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
