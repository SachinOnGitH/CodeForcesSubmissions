// Codeforces: https://codeforces.com/contest/2260/A
// Problem: Monocarp's Contest
// Submission: https://codeforces.com/contest/2260/submission/389892747
// Language: Java 21
// Submitted: 2026-09-08T14:45:10.000Z
// Rating: 800
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int[] arr = new int[n];
            int zeroCount = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j] == 0) {
                    zeroCount++;
                }
            }

            if (zeroCount < 2) {
                System.out.println(-1);
            } else {
                int ops = 0;

                if (arr[0] == 1) {
                    ops++;
                }

                if (arr[n - 1] == 1) {
                    ops++;
                }

                System.out.println(ops);
            }
        }

        scanner.close();
    }
}
