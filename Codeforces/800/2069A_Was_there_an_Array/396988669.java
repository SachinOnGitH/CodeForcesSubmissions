// Codeforces: https://codeforces.com/contest/2069/A
// Problem: Was there an Array?
// Submission: https://codeforces.com/contest/2069/submission/396988669
// Language: Java 21
// Submitted: 2026-11-01T09:13:25.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n - 2];

            for (int i = 0; i < n - 2; i++) {
                b[i] = sc.nextInt();
            }

            boolean possible = true;

            for (int i = 0; i < n - 4; i++) {
                if (b[i] == 1 && b[i + 2] == 1 && b[i + 1] == 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
