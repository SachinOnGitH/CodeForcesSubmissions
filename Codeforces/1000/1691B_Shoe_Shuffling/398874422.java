// Codeforces: https://codeforces.com/contest/1691/B
// Problem: Shoe Shuffling
// Submission: https://codeforces.com/contest/1691/submission/398874422
// Language: Java 21
// Submitted: 2026-11-17T05:28:30.000Z
// Rating: 1000
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
            int[] p = new int[n];
            boolean ok = true;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j + 1 < n && a[j + 1] == a[i]) j++;
                if (i == j) {
                    ok = false;
                    break;
                }
                for (int k = i; k < j; k++) p[k] = k + 2;
                p[j] = i + 1;
                i = j + 1;
            }
            if (!ok) {
                sb.append("-1\n");
            } else {
                for (int k = 0; k < n; k++) sb.append(p[k]).append(k + 1 < n ? " " : "\n");
            }
        }
        System.out.print(sb);
    }
}
