// Codeforces: https://codeforces.com/contest/1837/A
// Problem: Grasshopper on a Line
// Submission: https://codeforces.com/contest/1837/submission/391957991
// Language: Java 21
// Submitted: 2026-09-25T08:00:02.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int k = sc.nextInt();

                if (x % k != 0) {
                    System.out.println(1);
                    System.out.println(x);
                } else {
                    System.out.println(2);
                    System.out.println((x - 1) + " " + 1);
                }
            }
        }
        sc.close();
    }
}
