// Codeforces: https://codeforces.com/contest/1620/B
// Problem: Triangles on a Rectangle
// Submission: https://codeforces.com/contest/1620/submission/398828030
// Language: Java 21
// Submitted: 2026-11-16T20:30:55.000Z
// Rating: 1000
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long w = Long.parseLong(st.nextToken());
            long h = Long.parseLong(st.nextToken());
            long ans = 0;
            for (int s = 0; s < 4; s++) {
                st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                long first = Long.parseLong(st.nextToken());
                long last = first;
                for (int i = 1; i < k; i++) last = Long.parseLong(st.nextToken());
                long dim = s < 2 ? h : w;
                ans = Math.max(ans, (last - first) * dim);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
