// Codeforces: https://codeforces.com/contest/1858/A
// Problem: Buttons
// Submission: https://codeforces.com/contest/1858/submission/391680741
// Language: Java 21
// Submitted: 2026-09-22T15:27:29.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                if (a + (c % 2) > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
        sc.close();
    }
}
