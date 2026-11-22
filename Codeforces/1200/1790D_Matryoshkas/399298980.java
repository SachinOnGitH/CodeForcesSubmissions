// Codeforces: https://codeforces.com/contest/1790/D
// Problem: Matryoshkas
// Submission: https://codeforces.com/contest/1790/submission/399298980
// Language: Java 21
// Submitted: 2026-11-21T05:59:25.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                long tmp = a[i]; a[i] = a[j]; a[j] = tmp;
            }
            Arrays.sort(a);
            long ans = 0;
            long prevVal = Long.MIN_VALUE / 2;
            int prevCnt = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && a[j] == a[i]) j++;
                int c = j - i;
                if (a[i] == prevVal + 1) ans += Math.max(0, c - prevCnt);
                else ans += c;
                prevVal = a[i];
                prevCnt = c;
                i = j;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
