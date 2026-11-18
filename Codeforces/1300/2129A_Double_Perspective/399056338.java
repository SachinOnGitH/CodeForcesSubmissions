// Codeforces: https://codeforces.com/contest/2129/A
// Problem: Double Perspective
// Submission: https://codeforces.com/contest/2129/submission/399056338
// Language: Java 21
// Submitted: 2026-11-18T14:22:13.000Z
// Rating: 1300
import java.util.*;
import java.io.*;

public class Main {
    static int[] p;

    static int find(int x) {
        while (p[x] != x) {
            p[x] = p[p[x]];
            x = p[x];
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            p = new int[2 * n + 1];
            for (int i = 0; i <= 2 * n; i++) p[i] = i;
            List<Integer> res = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int x = find(a), y = find(b);
                if (x != y) {
                    p[x] = y;
                    res.add(i);
                }
            }
            sb.append(res.size()).append("\n");
            for (int i = 0; i < res.size(); i++) sb.append(res.get(i)).append(i + 1 < res.size() ? " " : "");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
