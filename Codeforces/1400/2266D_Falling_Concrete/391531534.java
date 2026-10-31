// Codeforces: https://codeforces.com/contest/2266/D
// Problem: Falling Concrete
// Submission: https://codeforces.com/contest/2266/submission/391531534
// Language: Java 21
// Submitted: 2026-09-21T16:49:19.000Z
// Rating: 1400
import java.util.Scanner;
import java.util.Arrays;

public class Main14 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    int t = sc.nextInt();
                    while (t-- > 0) {
                        int n = sc.nextInt();
                        long[] c = new long[n];
                        for (int i = 0; i < n; i++) {
                            c[i] = sc.nextLong() - i;
                        }

                        Arrays.sort(c);

                        int maxLen = 1;
                        int currentLen = 1;
                        for (int i = 1; i < n; i++) {
                            if (c[i] == c[i - 1] + 1) {
                                currentLen++;
                            } else if (c[i] != c[i - 1]) {
                                currentLen = 1;
                            }
                            maxLen = Math.max(maxLen, currentLen);
                        }

                        System.out.println(maxLen);
                    }
                }
                sc.close();
    }
}
