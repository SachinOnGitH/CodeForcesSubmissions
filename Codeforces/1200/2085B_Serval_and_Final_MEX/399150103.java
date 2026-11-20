// Codeforces: https://codeforces.com/contest/2085/B
// Problem: Serval and Final MEX
// Submission: https://codeforces.com/contest/2085/submission/399150103
// Language: Java 21
// Submitted: 2026-11-19T15:02:51.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int t = (int) in.nval;
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            in.nextToken();
            int n = (int) in.nval;
            int[] a = new int[n + 1];
            int first = -1;
            int last = -1;
            for (int i = 1; i <= n; i++) {
                in.nextToken();
                a[i] = (int) in.nval;
                if (a[i] == 0) {
                    if (first == -1) first = i;
                    last = i;
                }
            }

            if (first == -1) {
                out.append(1).append('\n');
                out.append(1).append(' ').append(n).append('\n');
                continue;
            }

            if (!(first == 1 && last == n)) {
                if (first < last) {
                    int newLen = n - (last - first);
                    out.append(2).append('\n');
                    out.append(first).append(' ').append(last).append('\n');
                    out.append(1).append(' ').append(newLen).append('\n');
                } else {
                    int l = first < n ? first : n - 1;
                    out.append(2).append('\n');
                    out.append(l).append(' ').append(l + 1).append('\n');
                    out.append(1).append(' ').append(n - 1).append('\n');
                }
                continue;
            }

            int next = -1;
            for (int j = 3; j <= n; j++) {
                if (a[j] == 0) {
                    next = j;
                    break;
                }
            }
            int p = next - 1;
            int q = n - 1;

            out.append(3).append('\n');
            out.append(1).append(' ').append(2).append('\n');
            if (p < q) {
                out.append(p).append(' ').append(q).append('\n');
                out.append(1).append(' ').append(p).append('\n');
            } else {
                out.append(n - 2).append(' ').append(n - 1).append('\n');
                out.append(1).append(' ').append(n - 2).append('\n');
            }
        }
        System.out.print(out);
    }
}
