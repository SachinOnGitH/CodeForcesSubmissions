// Codeforces: https://codeforces.com/contest/2269/D
// Problem: What a SauSaGe! It's All Meat
// Submission: https://codeforces.com/contest/2269/submission/392215109
// Language: Java 21
// Submitted: 2026-09-26T15:55:43.000Z
// Rating: 1500
import java.io.*;
import java.util.*;

public class Main {
    static boolean good(int x) {
        return (Integer.bitCount(x) & 1) == 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            int ans = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());

                if (good(a[i])) {
                    ans++;
                }
            }

            out.append(ans);

            for (int i = 0; i < q; i++) {
                st = new StringTokenizer(br.readLine());

                int p = Integer.parseInt(st.nextToken()) - 1;
                int x = Integer.parseInt(st.nextToken());

                if (good(a[p])) {
                    ans--;
                }

                a[p] = x;

                if (good(a[p])) {
                    ans++;
                }

                out.append(' ').append(ans);
            }

            out.append('\n');
        }

        System.out.print(out);
    }
}
