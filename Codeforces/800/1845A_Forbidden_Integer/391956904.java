// Codeforces: https://codeforces.com/contest/1845/A
// Problem: Forbidden Integer
// Submission: https://codeforces.com/contest/1845/submission/391956904
// Language: Java 21
// Submitted: 2026-09-25T07:45:43.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int x = sc.nextInt();

                if (x != 1) {
                    System.out.println("YES");
                    System.out.println(n);
                    for (int i = 0; i < n; i++) {
                        System.out.print(1 + (i == n - 1 ? "" : " "));
                    }
                    System.out.println();
                } else if (k == 1 || (k == 2 && n % 2 != 0)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    if (n % 2 == 0) {
                        System.out.println(n / 2);
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print(2 + (i == n / 2 - 1 ? "" : " "));
                        }
                        System.out.println();
                    } else {
                        System.out.println((n - 3) / 2 + 1);
                        System.out.print("3");
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            System.out.print(" 2");
                        }
                        System.out.println();
                    }
                }
            }
        }
        sc.close();
    }
}
