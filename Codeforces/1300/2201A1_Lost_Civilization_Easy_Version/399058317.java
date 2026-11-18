// Codeforces: https://codeforces.com/contest/2201/A1
// Problem: Lost Civilization (Easy Version)
// Submission: https://codeforces.com/contest/2201/submission/399058317
// Language: Java 21
// Submitted: 2026-11-18T14:54:37.000Z
// Rating: 1300
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
            int[] stack = new int[n + 1];
            int sz = 0;
            HashMap<Integer, Integer> cnt = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (cnt.getOrDefault(x - 1, 0) > 0) {
                    while (stack[sz - 1] != x - 1) {
                        int v = stack[--sz];
                        cnt.merge(v, -1, Integer::sum);
                    }
                    stack[sz++] = x;
                    cnt.merge(x, 1, Integer::sum);
                } else {
                    ans++;
                    while (sz > 0) {
                        int v = stack[--sz];
                        cnt.merge(v, -1, Integer::sum);
                    }
                    stack[sz++] = x;
                    cnt.merge(x, 1, Integer::sum);
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
