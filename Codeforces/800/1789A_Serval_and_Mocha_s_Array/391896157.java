// Codeforces: https://codeforces.com/contest/1789/A
// Problem: Serval and Mocha's Array
// Submission: https://codeforces.com/contest/1789/submission/391896157
// Language: Java 21
// Submitted: 2026-09-24T15:40:24.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                boolean possible = false;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (gcd(a[i], a[j]) <= 2) {
                            possible = true;
                            break;
                        }
                    }
                    if (possible) break;
                }

                if (possible) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
