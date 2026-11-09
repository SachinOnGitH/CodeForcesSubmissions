// Codeforces: https://codeforces.com/contest/2122/C
// Problem: Manhattan Pairs
// Submission: https://codeforces.com/contest/2122/submission/397933477
// Language: Java 21
// Submitted: 2026-11-09T12:43:32.000Z
// Rating: 1700

import java.util.*;

public class Main {
    static class Point {
        int x, y, id;

        Point(int x, int y, int id) {
            this.x = x;
            this.y = y;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Point[] p = new Point[n];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                p[i] = new Point(x, y, i + 1);
            }

            Arrays.sort(p, (a, b) -> Integer.compare(a.x, b.x));

            Arrays.sort(p, 0, n / 2,
                    (a, b) -> Integer.compare(a.y, b.y));

            Arrays.sort(p, n / 2, n,
                    (a, b) -> Integer.compare(b.y, a.y));

            for (int i = 0; i < n / 2; i++) {
                System.out.println(p[i].id + " " + p[n / 2 + i].id);
            }
        }

        sc.close();
    }
}

