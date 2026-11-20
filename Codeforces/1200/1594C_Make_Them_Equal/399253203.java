// Codeforces: https://codeforces.com/contest/1594/C
// Problem: Make Them Equal
// Submission: https://codeforces.com/contest/1594/submission/399253203
// Language: Java 21
// Submitted: 2026-11-20T15:53:01.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine().trim();
            int cnt = 0;
            for (int i = 0; i < n; i++) if (s.charAt(i) == c) cnt++;
            if (cnt == n) {
                out.append("0\n");
                continue;
            }
            int pos = -1;
            for (int i = n; i >= 1; i--) {
                if (2 * i > n && s.charAt(i - 1) == c) {
                    pos = i;
                    break;
                }
            }
            if (pos != -1) {
                out.append("1\n").append(pos).append('\n');
            } else {
                out.append("2\n").append(n).append(' ').append(n - 1).append('\n');
            }
        }
        System.out.print(out);
    }
}
