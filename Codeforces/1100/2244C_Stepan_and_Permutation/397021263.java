// Codeforces: https://codeforces.com/contest/2244/C
// Problem: Stepan and Permutation
// Submission: https://codeforces.com/contest/2244/submission/397021263
// Language: Java 21
// Submitted: 2026-11-01T14:21:52.000Z
// Rating: 1100
import java.util.*;
import java.io.*;

public class Main {
    static int[] p;

    static int find(int a) {
        if (p[a] == a) return a;
        return p[a] = find(p[a]);
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int t = (int) in.nval;
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            in.nextToken();
            int n = (int) in.nval;
            in.nextToken();
            int x = (int) in.nval;
            in.nextToken();
            int y = (int) in.nval;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                in.nextToken();
                a[i] = (int) in.nval - 1;
            }

            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;

            for (int i = 0; i < n; i++) {
                if (i + x < n) p[find(i)] = find(i + x);
                if (i + y < n) p[find(i)] = find(i + y);
            }

            boolean good = true;
            for (int i = 0; i < n; i++) {
                if (find(i) != find(a[i])) {
                    good = false;
                    break;
                }
            }
            out.append(good ? "YES\n" : "NO\n");
        }
        System.out.print(out);
    }
}
