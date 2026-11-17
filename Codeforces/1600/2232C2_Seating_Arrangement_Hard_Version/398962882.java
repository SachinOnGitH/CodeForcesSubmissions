// Codeforces: https://codeforces.com/contest/2232/C2
// Problem: Seating Arrangement (Hard Version)
// Submission: https://codeforces.com/contest/2232/submission/398962882
// Language: Java 21
// Submitted: 2026-11-17T16:15:09.000Z
// Rating: 1600
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long s = sc.nextLong();
            String people = sc.next();

            long opened = 0;
            long seated = 0;
            long flexible = 0;

            for (int i = 0; i < n; i++) {
                char c = people.charAt(i);
                long free = opened * s - seated;

                if (c == 'I') {
                    if (opened < x) {
                        opened++;
                        seated++;
                    }
                } else if (c == 'E') {
                    if (free > 0) {
                        seated++;
                    } else if (flexible > 0 && opened < x) {
                        opened++;
                        flexible--;
                        seated++;
                    }
                } else {
                    if (free > 0) {
                        seated++;
                        flexible++;
                    } else if (opened < x) {
                        opened++;
                        seated++;
                    }
                }
            }
            out.append(seated).append('\n');
        }
        System.out.print(out);
    }
}
