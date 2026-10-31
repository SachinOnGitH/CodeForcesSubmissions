// Codeforces: https://codeforces.com/contest/1834/A
// Problem: Unit Array
// Submission: https://codeforces.com/contest/1834/submission/391956399
// Language: Java 21
// Submitted: 2026-09-25T07:38:15.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int countPos = 0;
                int countNeg = 0;

                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    if (val == 1) {
                        countPos++;
                    } else {
                        countNeg++;
                    }
                }

                int ops = 0;
                if (countPos < countNeg) {
                    int diff = countNeg - countPos;
                    ops = (diff + 1) / 2;
                    countPos += ops;
                    countNeg -= ops;
                }

                if (countNeg % 2 != 0) {
                    ops++;
                }

                System.out.println(ops);
            }
        }
        sc.close();
    }
}
