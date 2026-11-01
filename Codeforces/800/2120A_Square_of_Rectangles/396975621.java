// Codeforces: https://codeforces.com/contest/2120/A
// Problem: Square of Rectangles
// Submission: https://codeforces.com/contest/2120/submission/396975621
// Language: Java 21
// Submitted: 2026-11-01T06:58:08.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] l = new int[3];
            int[] b = new int[3];

            int area = 0;

            for (int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
                b[i] = sc.nextInt();
                area += l[i] * b[i];
            }

            int s = (int) Math.sqrt(area);
            boolean possible = false;

            if (s * s == area) {
                if (b[0] == s && b[1] == s && b[2] == s
                        && l[0] + l[1] + l[2] == s) {
                    possible = true;
                }

                if (l[0] == s && l[1] == s && l[2] == s
                        && b[0] + b[1] + b[2] == s) {
                    possible = true;
                }

                for (int i = 0; i < 3; i++) {
                    int j = (i + 1) % 3;
                    int k = (i + 2) % 3;

                    if (l[i] == s && l[j] + l[k] == s
                            && b[j] == b[k]
                            && b[i] + b[j] == s) {
                        possible = true;
                    }

                    if (b[i] == s && b[j] + b[k] == s
                            && l[j] == l[k]
                            && l[i] + l[j] == s) {
                        possible = true;
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
