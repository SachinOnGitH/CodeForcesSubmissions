// Codeforces: https://codeforces.com/contest/1520/D
// Problem: Same Differences
// Submission: https://codeforces.com/contest/1520/submission/399203192
// Language: Java 21
// Submitted: 2026-11-20T07:20:52.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        Random rnd = new Random();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] b = new long[n];
            for (int i = 0; i < n; i++) b[i] = Long.parseLong(st.nextToken()) - i;
            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                long tmp = b[i];
                b[i] = b[j];
                b[j] = tmp;
            }
            Arrays.sort(b);
            long count = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && b[j] == b[i]) j++;
                long c = j - i;
                count += c * (c - 1) / 2;
                i = j;
            }
            out.append(count).append('\n');
        }
        System.out.print(out);
    }
}
