// Codeforces: https://codeforces.com/contest/1373/B
// Problem: 01 Game
// Submission: https://codeforces.com/contest/1373/submission/392292804
// Language: Java 21
// Submitted: 2026-09-27T06:41:52.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int count0 = 0;
                int count1 = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        count0++;
                    } else {
                        count1++;
                    }
                }

                int moves = Math.min(count0, count1);

                if (moves % 2 == 1) {
                    System.out.println("DA");
                } else {
                    System.out.println("NET");
                }
            }
        }
        sc.close();
    }
}
