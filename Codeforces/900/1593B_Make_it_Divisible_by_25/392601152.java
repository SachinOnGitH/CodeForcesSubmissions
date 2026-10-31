// Codeforces: https://codeforces.com/contest/1593/B
// Problem: Make it Divisible by 25
// Submission: https://codeforces.com/contest/1593/submission/392601152
// Language: Java 21
// Submitted: 2026-09-29T12:30:37.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int minDeletions = Integer.MAX_VALUE;

                String[] targets = {"00", "25", "50", "75"};

                for (String target : targets) {
                    char d2 = target.charAt(1);
                    char d1 = target.charAt(0);

                    int len = s.length();
                    int j = -1;
                    for (int k = len - 1; k >= 0; k--) {
                        if (s.charAt(k) == d2) {
                            j = k;
                            break;
                        }
                    }

                    if (j == -1) continue;

                    int i = -1;
                    for (int k = j - 1; k >= 0; k--) {
                        if (s.charAt(k) == d1) {
                            i = k;
                            break;
                        }
                    }

                    if (i != -1) {
                        minDeletions = Math.min(minDeletions, len - 2 - i);
                    }
                }

                System.out.println(minDeletions);
            }
        }
        sc.close();
    }
}
