// Codeforces: https://codeforces.com/contest/1862/B
// Problem: Sequence Game
// Submission: https://codeforces.com/contest/1862/submission/391898164
// Language: Java 21
// Submitted: 2026-09-24T15:59:44.000Z
// Rating: 800
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int m = sc.nextInt();
                int[] b = new int[m];
                for (int i = 0; i < m; i++) {
                    b[i] = sc.nextInt();
                }

                List<Integer> a = new ArrayList<>();
                a.add(b[0]);

                for (int i = 1; i < m; i++) {
                    if (b[i] < b[i - 1]) {
                        a.add(b[i]);
                    }
                    a.add(b[i]);
                }

                System.out.println(a.size());
                for (int i = 0; i < a.size(); i++) {
                    System.out.print(a.get(i) + (i == a.size() - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
