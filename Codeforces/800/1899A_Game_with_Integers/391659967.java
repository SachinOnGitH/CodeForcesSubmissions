// Codeforces: https://codeforces.com/contest/1899/A
// Problem: Game with Integers
// Submission: https://codeforces.com/contest/1899/submission/391659967
// Language: Java 21
// Submitted: 2026-09-22T12:38:42.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                if (n % 3 != 0) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
        sc.close();
    }
}
