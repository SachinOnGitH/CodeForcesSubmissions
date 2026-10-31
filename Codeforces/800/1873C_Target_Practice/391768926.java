// Codeforces: https://codeforces.com/contest/1873/C
// Problem: Target Practice
// Submission: https://codeforces.com/contest/1873/submission/391768926
// Language: Java 21
// Submitted: 2026-09-23T11:45:01.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int totalPoints = 0;
                for (int r = 0; r < 10; r++) {
                    String row = sc.next();
                    for (int c = 0; c < 10; c++) {
                        if (row.charAt(c) == 'X') {
                            int ring = Math.min(Math.min(r, 9 - r), Math.min(c, 9 - c)) + 1;
                            totalPoints += ring;
                        }
                    }
                }
                System.out.println(totalPoints);
            }
        }
        sc.close();
    }
}
