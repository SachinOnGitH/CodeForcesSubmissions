// Codeforces: https://codeforces.com/contest/1859/A
// Problem: United We Stand
// Submission: https://codeforces.com/contest/1859/submission/391947885
// Language: Java 21
// Submitted: 2026-09-25T05:40:58.000Z
// Rating: 800
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

                Arrays.sort(a);

                if (a[0] == a[n - 1]) {
                    System.out.println(-1);
                    continue;
                }

                List<Integer> b = new ArrayList<>();
                List<Integer> c = new ArrayList<>();

                for (int x : a) {
                    if (x == a[n - 1]) {
                        c.add(x);
                    } else {
                        b.add(x);
                    }
                }

                System.out.println(b.size() + " " + c.size());
                for (int i = 0; i < b.size(); i++) {
                    System.out.print(b.get(i) + (i == b.size() - 1 ? "" : " "));
                }
                System.out.println();
                for (int i = 0; i < c.size(); i++) {
                    System.out.print(c.get(i) + (i == c.size() - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
