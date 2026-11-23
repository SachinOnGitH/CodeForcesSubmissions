// Codeforces: https://codeforces.com/contest/1704/C
// Problem: Virus
// Submission: https://codeforces.com/contest/1704/submission/399509745
// Language: Java 21
// Submitted: 2026-11-22T16:10:30.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long[] a = new long[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) a[i] = Long.parseLong(st.nextToken());
            for (int i = m - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                long tmp = a[i]; a[i] = a[j]; a[j] = tmp;
            }
            Arrays.sort(a);
            long[] g = new long[m];
            for (int i = 0; i + 1 < m; i++) g[i] = a[i + 1] - a[i] - 1;
            g[m - 1] = a[0] + n - a[m - 1] - 1;
            Arrays.sort(g);
            long days = 0, saved = 0;
            for (int i = m - 1; i >= 0; i--) {
                long r = g[i] - 2 * days;
                if (r <= 0) break;
                if (r == 1) {
                    saved += 1;
                    days += 1;
                } else {
                    saved += r - 1;
                    days += 2;
                }
            }
            sb.append(n - saved).append("\n");
        }
        System.out.print(sb);
    }
}
