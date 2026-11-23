// Codeforces: https://codeforces.com/contest/1729/D
// Problem: Friends and the Restaurant
// Submission: https://codeforces.com/contest/1729/submission/399511546
// Language: Java 21
// Submitted: 2026-11-22T16:32:50.000Z
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
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer sx = new StringTokenizer(br.readLine());
            StringTokenizer sy = new StringTokenizer(br.readLine());
            long[] d = new long[n];
            for (int i = 0; i < n; i++) d[i] = Long.parseLong(sx.nextToken());
            for (int i = 0; i < n; i++) d[i] = Long.parseLong(sy.nextToken()) - d[i];
            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                long tmp = d[i]; d[i] = d[j]; d[j] = tmp;
            }
            Arrays.sort(d);
            int l = 0, r = n - 1, ans = 0;
            while (l < r) {
                if (d[l] + d[r] >= 0) {
                    ans++;
                    l++;
                    r--;
                } else {
                    l++;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
