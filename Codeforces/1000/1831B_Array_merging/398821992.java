// Codeforces: https://codeforces.com/contest/1831/B
// Problem: Array merging
// Submission: https://codeforces.com/contest/1831/submission/398821992
// Language: Java 21
// Submitted: 2026-11-16T18:56:44.000Z
// Rating: 1000
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = ni(in);
        while (t-- > 0) {
            int n = ni(in);
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni(in);
            for (int i = 0; i < n; i++) b[i] = ni(in);
            int[] ma = new int[2 * n + 1];
            int[] mb = new int[2 * n + 1];
            int run = 0;
            for (int i = 0; i < n; i++) {
                if (i > 0 && a[i] == a[i - 1]) run++;
                else run = 1;
                ma[a[i]] = Math.max(ma[a[i]], run);
            }
            for (int i = 0; i < n; i++) {
                if (i > 0 && b[i] == b[i - 1]) run++;
                else run = 1;
                mb[b[i]] = Math.max(mb[b[i]], run);
            }
            int ans = 0;
            for (int v = 1; v <= 2 * n; v++) ans = Math.max(ans, ma[v] + mb[v]);
            System.out.println(ans);
        }
    }

    static int ni(DataInputStream in) throws IOException {
        int ret = 0, b;
        do {
            b = in.read();
        } while (b < '0');
        while (b >= '0') {
            ret = ret * 10 + b - '0';
            b = in.read();
        }
        return ret;
    }
}
